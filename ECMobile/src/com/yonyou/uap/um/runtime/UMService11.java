
package com.yonyou.uap.um.runtime;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.*;
import android.content.*;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.yonyou.uap.um.application.ApplicationContext;
import com.yonyou.uap.um.base.UMEventArgs;
import com.yonyou.uap.um.common.Common;
import com.yonyou.uap.um.core.UMActivity;
import com.yonyou.uap.um.core.XJSON;
import com.yonyou.uap.um.service.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.yonyou.uap.um.runtime:
//            RTHelper, UMDevice, UMImageService

@TargetApi(Build.VERSION_CODES.HONEYCOMB) @SuppressLint("NewApi") public class UMService11
{

    public UMService11()
    {
    }

    private static synchronized String getDefaultTp(Context ctx)
    {
        if(TextUtils.isEmpty(currentTp))
        {
            currentTp = ApplicationContext.getCurrent(ctx).getValue("tp");
            if(TextUtils.isEmpty(currentTp))
            {
                ApplicationContext.getCurrent(ctx).setValue("tp", "des");
                currentTp = "des";
            }
        }
        return currentTp;
    }

    private static void callActionDemo(UMEventArgs args)
    {
        RTHelper.enterService(com.yonyou.uap.um.runtime.UMService.class, "callActionDemo", args);
        String file = (new StringBuilder()).append("demo/").append(args.getString("viewid")).append(".").append(args.getString("action")).append(".txt").toString();
        InputStream is = null;
        BufferedReader reader = null;
        StringBuffer rs = new StringBuffer();
        try
        {
            is = args.getUMActivity().getAssets().open(file);
            reader = new BufferedReader(new InputStreamReader(is));
            for(String s = null; (s = reader.readLine()) != null;)
                rs.append(s);

            reader.close();
            is.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        ServiceCallback cbObj = (ServiceCallback)args.get("callback_object");
        if(cbObj == null)
            cbObj = new UMDefaultService(args.getUMActivity(), args);
        (new ServiceProxy(args.getUMActivity())).TestDemo(rs.toString(), cbObj);
    }

    public static String getNetStatus(UMEventArgs args)
    {
        return "NONE";
    }

    public static String callAction(UMEventArgs args)
    {
        RTHelper.enterService(com.yonyou.uap.um.runtime.UMService.class, "callAction", args);
        args.check("action");
        return callServiceX(args, "action");
    }

    public static String callService(UMEventArgs args)
    {
        RTHelper.enterService(com.yonyou.uap.um.runtime.UMService.class, "callService", args);
        args.check("serviceid");
        return callServiceX(args, "service");
    }

    private static String callServiceX(UMEventArgs args, String type)
    {
        UMActivity context = args.getUMActivity();
        boolean isSync = args.popBoolean("sync", false);
        String tp = args.popString("tp", getDefaultTp(context));
        int timeout = args.popInt("timeout", 15000);
        ServiceCallback cbObject = null;
        Object cbobj = args.get("callback_object");
        if(cbobj == null)
            cbObject = getCallbackObject(args, context, "default");
        else
        if(cbobj instanceof ServiceCallback)
        {
            args.popString("callback_object", "");
            cbObject = (ServiceCallback)cbobj;
        } else
        {
            cbObject = getCallbackObject(args, context, cbobj.toString());
        }
        try
        {
            JSONObject data = null;
            if(type.equalsIgnoreCase("service"))
                data = buildServiceContextInfo(args, context);
            else
            if(type.equalsIgnoreCase("action"))
                data = buildActionContextInfo(args, context);
            if(data == null)
                throw new Error((new StringBuilder()).append("\u65E0\u6548\u7684\u670D\u52A1\u7C7B\u578B - ").append(type).toString());
            else
                return callServiceEX(context, data, tp, isSync, cbObject, timeout, args.getString("accessurl", "umserver/core/"));
        }
        catch(JSONException e)
        {
            e.printStackTrace();
        }
        return "error";
    }

    public static JSONObject buildActionContextInfo(UMEventArgs args, UMActivity context)
        throws JSONException
    {
        JSONObject data = new JSONObject();
        String maUpload = args.getString("mauploadpath", "");
        if(!"".equals(maUpload))
            data.put("mauploadpath", maUpload);
        args.remove("mauploadpath");
        data.put("deviceinfo", getDeviceInformation(context));
        data.put("servicecontext", getServiceContext(args));
        data.put("appcontext", getApplicationContext(context));
        data.put("serviceid", null != args.get("serviceid") ? ((Object) (args.get("serviceid").toString())) : "umCommonService");
        return data;
    }

    private static String callServiceEX(UMActivity context, JSONObject data, String tp, boolean isSync, ServiceCallback callbackObject, int timeout, String url)
    {
        return ServiceRuntime.callHttpRequest(context, url, data, tp, isSync, callbackObject, timeout);
    }

    private static ServiceCallback getCallbackObject(UMEventArgs args, UMActivity context, String cbObject)
    {
        ServiceCallback cbObj;
        if(cbObject.equalsIgnoreCase("login"))
            cbObj = new UMLoginService(context, args);
        else
        if(cbObject.equalsIgnoreCase("branch"))
            cbObj = new UMBranchService(context, args);
        else
        if(cbObject.equalsIgnoreCase("download"))
            cbObj = new UMDownloadService(context, args);
        else
        if(cbObject.equalsIgnoreCase("transInfo"))
            cbObj = new UMTransInfoService(context, args);
        else
            cbObj = new UMDefaultService(context, args);
        return cbObj;
    }

    public static String openHTTPS(UMEventArgs args)
    {
        RTHelper.enterService(com.yonyou.uap.um.runtime.UMService.class, "openHTTPS", args);
        ApplicationContext.getCurrent(args.getUMActivity());
        if(args.containkey("ishttps"))
            ApplicationContext.setHttps("true".equalsIgnoreCase(args.getString("ishttps")));
        else
            ApplicationContext.setHttps(true);
        RTHelper.execCallBack(args);
        return "success";
    }

    public static String closeHTTPS(UMEventArgs args)
    {
        RTHelper.enterService(com.yonyou.uap.um.runtime.UMService.class, "closeHTTPS", args);
        ApplicationContext.getCurrent(args.getUMActivity());
        ApplicationContext.setHttps(false);
        RTHelper.execCallBack(args);
        return "success";
    }

    public static String checkVersion(UMEventArgs args)
    {
        RTHelper.enterService(com.yonyou.uap.um.runtime.UMService.class, "checkUpdate", args);
        RTHelper.execCallBack(args);
        RTHelper.exitService(com.yonyou.uap.um.runtime.UMService.class, "checkUpdate", args);
        return "success";
    }

    private static JSONObject getServiceContext(UMEventArgs args)
        throws JSONException
    {
        JSONObject json = new JSONObject();
        json.put("actionid", "umCommonService");
        json.put("callback", "nothing");
        json.put("viewid", args.containkey("controller") ? ((Object) (args.getString("controller"))) : ((Object) (args.getString("viewid"))));
        json.put("controllerid", args.getString("viewid"));
        json.put("actionname", args.getString("action"));
        JSONObject params = null;
        if(args.containkey("params"))
        {
            params = new JSONObject(args.getString("params"));
            if(args.get("params") == null || "".equalsIgnoreCase(args.get("params").toString()))
                json.put("params", "{}");
            else
                json.put("params", args.get("params"));
        } else
        {
            params = new JSONObject();
            Iterator i$ = args.keySet().iterator();
            do
            {
                if(!i$.hasNext())
                    break;
                String key = (String)i$.next();
                if(!key.equalsIgnoreCase("viewid") && !key.equalsIgnoreCase("controller") && !key.equalsIgnoreCase("action"))
                    params.put(key, args.getString(key));
            } while(true);
        }
        json.put("params", params);
        return json;
    }

    private static JSONObject getDeviceInformation(UMActivity context)
        throws JSONException
    {
        JSONObject devinfo = new JSONObject();
        ApplicationContext appctx = ApplicationContext.getCurrent(context);
        devinfo.put("devid", appctx.getDeviceID());
        devinfo.put("wfaddress", appctx.getWfAddress());
        devinfo.put("mac", appctx.getWfAddress());
        devinfo.put("name", Build.MODEL);
        devinfo.put("uuid", "");
        devinfo.put("style", "android");
        devinfo.put("os", "android");
        devinfo.put("lang", appctx.getLanguage());
        devinfo.put("versionname", appctx.getVersionName());
        devinfo.put("appversion", appctx.getVersionCode());
        devinfo.put("isroot", ApplicationContext.getRooted(context));
        devinfo.put("ssid", appctx.getSSID());
        devinfo.put("ncdevid", appctx.getImei());
        devinfo.put("osversion", android.os.Build.VERSION.RELEASE);
        return devinfo;
    }

    private static JSONObject getApplicationContext(UMActivity activity)
    {
        ApplicationContext ctx = ApplicationContext.getCurrent(activity);
        JSONObject rs = new JSONObject();
        try
        {
            rs.put("sessionid", ctx.getSessionID());
            rs.put("user", ctx.getUser());
            rs.put("pass", ctx.getPasswd());
            rs.put("userid", ctx.getUserId());
            rs.put("groupid", ctx.getGroupId());
            rs.put("devid", ctx.getDeviceID());
            rs.put("appid", ctx.getApplicationID());
            rs.put("token", ctx.getToken());
            rs.put("massotoken", ctx.getMASsotoken());
            rs.put("funcid", ctx.getFuncID());
            rs.put("tabid", ctx.getTABID());
        }
        catch(JSONException e) { }
        return rs;
    }

    private static String replaceContextStr(String contextStr)
    {
        String firstReplaceStr = contextStr.replaceAll("\\\\", "");
        String secondReplaceStr = firstReplaceStr.replace("}\"", "}");
        String thirdReplaceStr = secondReplaceStr.replace("\"{", "{");
        return thirdReplaceStr;
    }

    public static void load(UMEventArgs args)
    {
        RTHelper.enterService(com.yonyou.uap.um.runtime.UMService.class, "load", args);
        args.put("action", "load");
        callAction(args);
    }

    public static void save(UMEventArgs args)
    {
        RTHelper.enterService(com.yonyou.uap.um.runtime.UMService.class, "save", args);
        args.getUMActivity().collectAll();
        if(!args.containkey("savedata"))
            args.put("savedata", "#{CONTEXT}");
        args.put("action", "save");
        callAction(args);
    }

    public static void writeConfigure(UMEventArgs args)
    {
        RTHelper.enterService(com.yonyou.uap.um.runtime.UMService.class, "writeConfigure", args);
        UMActivity at = args.getUMActivity();
        SharedPreferences shared = at.getSharedPreferences("umservice_configure", 0);
        android.content.SharedPreferences.Editor edit = shared.edit();
        Iterator i$ = args.keySet().iterator();
        do
        {
            if(!i$.hasNext())
                break;
            String key = (String)i$.next();
            if(!key.equals("callback"))
                edit.putString(key.toUpperCase(), args.getString(key));
        } while(true);
        edit.commit();
        RTHelper.execCallBack(args);
    }

    public static void loadConfigure(UMEventArgs args)
    {
        RTHelper.enterService(com.yonyou.uap.um.runtime.UMService.class, "loadConfigure", args);
        UMActivity at = args.getUMActivity();
        SharedPreferences sp = at.getSharedPreferences("umservice_configure", 0);
        if(args.containkey("context"))
        {
            String value = sp.getString(args.getString("context").toUpperCase(), "");
            if(value.equals(""))
                at.setUMContext(new XJSON());
            else
                try
                {
                    at.setUMContext(value);
                }
                catch(JSONException e)
                {
                    e.printStackTrace();
                }
        } else
        {
            Iterator i$ = args.keySet().iterator();
            do
            {
                if(!i$.hasNext())
                    break;
                String key = (String)i$.next();
                if(!key.equalsIgnoreCase("isdatabinding"))
                {
                    String path = args.getString(key);
                    String value = sp.getString(key.toUpperCase(), "");
                    at.getUMContext().setValue(path, value);
                }
            } while(true);
            Log.v("UMService.loadConfigure", at.getUMContext().toString());
            if(args.getBoolean("isdatabinding", true))
                at.onDatabinding();
        }
        RTHelper.execCallBack(args);
    }

    public static String readConfigure(UMEventArgs args)
    {
        RTHelper.enterService(com.yonyou.uap.um.runtime.UMService.class, "readConfigure", args);
        String result = "";
        try
        {
            UMActivity at = args.getUMActivity();
            SharedPreferences sp = at.getSharedPreferences("umservice_configure", 0);
            for(Iterator i$ = args.keySet().iterator(); i$.hasNext();)
            {
                String key = (String)i$.next();
                result = sp.getString(key.toUpperCase(), "");
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        Log.v("UMService.readConfigure", result);
        return result;
    }

    public static void loadByURL(UMEventArgs args)
    {
        try
        {
            UMActivity context = args.getUMActivity();
            String url = (new StringBuilder()).append(args.getString("host")).append(args.getString("action")).toString();
            String orderno = context.getIntent().getStringExtra("orderno");
            if(orderno == null)
                orderno = "";
            url = url.replace("@X{orderno}", orderno);
            (new ServiceProxy(context)).start(url, new UMDefaultService(context));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void search(UMEventArgs args)
    {
        Context context = args.getUMActivity();
        String action = args.getString("action");
        String search = args.getString("search");
        action = action.replace("[search]", search);
        args.put("action", action);
        load(args);
    }

    public static String login(UMEventArgs args)
    {
        RTHelper.enterService(com.yonyou.uap.um.runtime.UMService.class, "login", args);
        args.check("type");
        String t = args.getString("type");
        if(t.equalsIgnoreCase("ua"))
            return loginUA(args);
        if(t.equalsIgnoreCase("u8"))
            return loginU8(args);
        if(t.equalsIgnoreCase("nc"))
            return loginNC(args);
        if(t.equalsIgnoreCase("UFGOV"))
            return loginUFGOV(args);
        else
            return loginXT(args);
    }

    private static String loginUFGOV(UMEventArgs args)
    {
        args.check("user");
        args.check("pass");
        ApplicationContext.getCurrent(args.getUMActivity()).setUser(args.getString("user"));
        ApplicationContext.getCurrent(args.getUMActivity()).setPasswd(args.getString("pass"));
        args.put("serviceid", "MALFService");
        if(!args.containkey("action"))
            args.put("action", "mobileLogin_getUserInforByCode");
        args.put("callback_object", "login");
        return callService(args);
    }

    public static String loginUA(UMEventArgs args)
    {
        UMActivity ctx = args.getUMActivity();
        Cursor c = args.getUMActivity().getContentResolver().query(URI_USER, null, null, null, null);
        if(c != null)
        {
            if(c.moveToFirst())
            {
                String token = c.getString(2);
                ApplicationContext appctx = ApplicationContext.getCurrent(ctx);
                appctx.setMASsotoken(token);
                appctx.setUser(c.getString(0));
                appctx.setPasswd(c.getString(1));
                args.put("serviceid", "ssoLoginService");
                if(!args.containkey("action"))
                    args.put("action", "umLogin");
                args.put("callback_object", "login");
                return callService(args);
            }
            String cb = args.getString("error", "");
            if(Common.isEmpty(cb))
            {
                ctx.showMessage("\u672A\u914D\u7F6EUAP\u7528\u6237");
                return "error";
            }
            ctx.run(cb, new UMEventArgs(ctx));
        }
        return "success";
    }

    private static String loginXT(UMEventArgs args)
    {
        return loginXT(args, false);
    }

    private static String loginXT(UMEventArgs args, boolean isUA)
    {
        args.check("user");
        args.check("pass");
        ApplicationContext.getCurrent(args.getUMActivity()).setUser(args.getString("user"));
        ApplicationContext.getCurrent(args.getUMActivity()).setPasswd(args.getString("pass"));
        args.put("serviceid", "xtLoginService");
        if(!args.containkey("action"))
            args.put("action", "umLogin");
        args.put("callback_object", "login");
        return callService(args);
    }

    public static String getHost(UMEventArgs args)
    {
        RTHelper.enterService(com.yonyou.uap.um.runtime.UMService.class, "getHost", args);
        return ServiceRuntime.getHostEx(args.getUMActivity());
    }

    private static String loginNC(UMEventArgs args)
    {
        args.check("user");
        args.check("pass");
        ApplicationContext.getCurrent(args.getUMActivity()).setUser(args.getString("user"));
        ApplicationContext.getCurrent(args.getUMActivity()).setPasswd(args.getString("pass"));
        args.put("serviceid", "ncLoginService");
        if(!args.containkey("action"))
            args.put("action", "umLogin");
        args.put("callback_object", "login");
        return callService(args);
    }

    private static JSONObject buildServiceContextInfo(UMEventArgs args, UMActivity context)
        throws JSONException
    {
        JSONObject data = new JSONObject();
        data.put("deviceinfo", getDeviceInformation(context));
        data.put("appcontext", getApplicationContext(context));
        data.put("serviceid", args.getString("serviceid"));
        if(args.containkey("servicecontext"))
        {
            data.put("servicecontext", args.getString("servicecontext"));
        } else
        {
            JSONObject sc = new JSONObject();
            sc.put("actionid", "");
            sc.put("callback", "");
            sc.put("viewid", "");
            sc.put("windowid", args.getUMActivity().getClass().getName());
            if(args.containkey("action"))
                sc.put("actionname", args.getString("action"));
            else
                sc.put("actionname", "");
            if(args.containkey("params"))
                if(args.get("params") == null || "".equalsIgnoreCase(args.get("params").toString()))
                    sc.put("params", "{}");
                else
                    sc.put("params", args.get("params"));
            Iterator i$ = args.keySet().iterator();
            do
            {
                if(!i$.hasNext())
                    break;
                String key = (String)i$.next();
                if(!key.equalsIgnoreCase("deviceinfo") && !key.equalsIgnoreCase("appcontext") && !key.equalsIgnoreCase("servicecontext") && !key.equalsIgnoreCase("serviceid"))
                    sc.put(key, args.getString(key));
            } while(true);
            data.put("servicecontext", sc);
        }
        return data;
    }

    private static String loginU8(UMEventArgs args)
    {
        UMActivity ctx = args.getUMActivity();
        if(Common.isEmpty(args.getString("usrcode")))
        {
            ctx.showMessage("\u767B\u5F55", "\u7528\u6237\u540D\u4E0D\u80FD\u4E3A\u7A7A");
            return "error";
        }
        if(Common.isEmpty(args.getString("groupid")))
        {
            ctx.showMessage("\u767B\u5F55", "\u8D26\u5957\u4E0D\u80FD\u4E3A\u7A7A");
            return "error";
        } else
        {
            ApplicationContext.getCurrent(ctx).setSessionID("");
            ApplicationContext.getCurrent(ctx).setGroupId(args.getString("groupid"));
            args.put("callback_object", "login");
            return callAction(args);
        }
    }

    public static String downloadFile(UMEventArgs args)
    {
        RTHelper.enterService(com.yonyou.uap.um.runtime.UMService.class, "downloadFile", args);
        args.check("fileid");
        args.check("filename");
        args.check("downloadpath");
        if(!args.containkey("downflag"))
            args.put("downflag", "false");
        args.put("serviceid", "umDownloadService");
        args.put("callback_object", "download");
        return callService(args);
    }

    public static String transInfoService(UMEventArgs args)
    {
        RTHelper.enterService(com.yonyou.uap.um.runtime.UMService.class, "transInfoService", args);
        args.check("infoid");
        args.check("binderfiled");
        if(!args.containkey("transtype") || args.getString("transtype").equalsIgnoreCase("other"))
            args.put("serviceid", "xtInfoDetailService");
        else
        if(args.getString("transtype").equalsIgnoreCase("word"))
            args.put("serviceid", "xtWordInfoDetailService");
        args.put("callback_object", "transInfo");
        if(!args.getString("type").equalsIgnoreCase("gzip"))
            args.put("contextmapping", (new StringBuilder()).append("{").append(args.getString("binderfiled")).append(":url}").toString());
        return callService(args);
    }

    public static void cropImage(UMEventArgs args)
    {
        UMDevice.capturePhoto(args);
    }

    public static void compressImage(UMEventArgs args)
    {
        UMImageService.compressImage(args);
    }

    public static void uploadImage(UMEventArgs args)
    {
        UMImageService.uploadImage(args);
    }

    public static String getResString(UMEventArgs args)
    {
        RTHelper.enterService(com.yonyou.uap.um.runtime.UMService.class, "getResString", args);
        String value = null;
        args.check("resname");
        String bindfield = "";
        if(args.containkey("bindfield"))
            bindfield = args.getString("bindfield");
        String resName = args.getString("resname");
        UMActivity ctx = args.getUMActivity();
        int resId = ctx.getResources().getIdentifier(resName, "string", ctx.getPackageName());
        if(resId > 0)
        {
            value = ctx.getResources().getString(resId);
            if(!bindfield.equalsIgnoreCase(""))
            {
                ctx.getUMContext().setValue(bindfield, value);
                ctx.dataBinding();
            } else
            {
                ctx.getUMContext().setValue("resstring", value);
            }
            return value;
        } else
        {
            return "Error MultiLanguage !";
        }
    }

    public static void post(UMEventArgs args)
    {
        args.put("method", "post");
        (new UMHttpService()).start(args);
    }

    public static void get(UMEventArgs args)
    {
        args.put("method", "get");
        (new UMHttpService()).start(args);
    }

    public static void setTimeTask(UMEventArgs args)
    {
        UMActivity umActivity = args.getUMActivity();
        if(mAlarmManager == null)
            mAlarmManager = (AlarmManager)umActivity.getSystemService("alarm");
        String viewid = args.getString("viewid");
        long time = System.currentTimeMillis();
        time += args.getLong("time", 0L);
        String type = args.getString("type");
        Intent intent = null;
        try
        {
            intent = new Intent(umActivity, Class.forName(viewid));
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
            Log.e("", (new StringBuilder()).append("viewid error ").append(viewid).toString());
            intent = new Intent(viewid);
        }
        Calendar c = Calendar.getInstance();
        PendingIntent pi = PendingIntent.getActivity(umActivity, 0, intent, 268435456);
        mAlarmManager.set(0, time, pi);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB) @SuppressLint("NewApi") public static void localNotification(UMEventArgs args)
    {
        final UMActivity ctx = args.getUMActivity();
        Timer timer = null;
        final String sendBody = args.getString("sendBody", "");
        final String sendTitle = args.getString("sendTitle", sendBody);
        final String tickerText = args.getString("tickerText", sendBody)!=null?args.getString("tickerText", sendBody):"";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = args.getString("sendTime", sdf.format(new Date()));
        Date date = null;
        try
        {
            date = sdf.parse(TextUtils.isEmpty(time) ? sdf.format(new Date()) : time);
        }
        catch(ParseException e1)
        {
            e1.printStackTrace();
        }
        String icon = args.getString("icon", "app.png");
        if(!TextUtils.isEmpty(icon))
            icon = icon.split("\\.")[0];
        final int res = ctx.getResources().getIdentifier(icon, "drawable", ctx.getPackageName());
        if(null == timer)
            timer = new Timer();
        timer.schedule(new TimerTask() {

            @TargetApi(Build.VERSION_CODES.HONEYCOMB) @SuppressLint("NewApi") public void run()
            { 
                Log.v("yyy", "play----");
                try
                {
                    Thread.sleep(100L);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                NotificationManager mn = (NotificationManager)ctx.getSystemService("notification");
                android.app.Notification.Builder builder = new android.app.Notification.Builder(ctx);
                Intent notificationIntent = new Intent();
                notificationIntent.putExtra("dismiss", true);
                PendingIntent contentIntent = PendingIntent.getService(ctx, 0, notificationIntent, 0);
                builder.setContentIntent(contentIntent);
                builder.setSmallIcon(res);
                builder.setTicker(sendTitle);
                builder.setContentText(sendBody);
                builder.setContentTitle(tickerText);
                builder.setAutoCancel(true);
                builder.setDefaults(-1);
                Notification notification = null;
                try
                {
                    notification = builder.build();
                }
                catch(Exception e)
                {
                    notification = new Notification(res, sendTitle, System.currentTimeMillis());
                    notification.setLatestEventInfo(ctx, sendTitle, sendBody, contentIntent);
                }
                mn.notify((int)System.currentTimeMillis(), notification);
            }

             UMActivity val$ctx;
             int val$res;
             String val$sendTitle;
             String val$sendBody;
             String val$tickerText;

            
//            {
//                ctx = umactivity;
//                res = i;
//                sendTitle = s;
//                sendBody = s1;
//                tickerText = s2;
//                super();
//            }
        }
, date);
    }

    public static final String CALLBACK = "callback";
    public static final String CONFIGURE = "umservice_configure";
    public static final String COMMON_SERVICE_ID = "umCommonService";
    public static final String CALLBACK_OBJECT = "callback_object";
    public static final String CALL_ACTION_PARAM = "params";
    public static final String MAPPING = "contextmapping";
    public static final String UPLOADPATH = "mauploadpath";
    public static final String IS_DATABINING = "autoDataBinding";
    private static final String DEFTP = "des";
    private static String currentTp = null;
    public static final Uri URI_USER = Uri.parse("content://com.yonyou.uap.setting.provider/user/");
    public static AlarmManager mAlarmManager;

}