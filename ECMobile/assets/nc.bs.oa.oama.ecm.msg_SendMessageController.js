Type.registerNamespace('nc.bs.oa.oama.ecm.msg_SendMessageController');
var isResume = true;
nc.bs.oa.oama.ecm.msg_SendMessageController = function() {

}

function nc$bs$oa$oama$ecm$msg_SendMessageController$initialize(ctx){
    //your logic code below...
    //demo code : var companyEnity = ctx.entity();
    //demo code : var departmentEntity = companyEnity.field("depts");
    //demo code : var employeeEntity = departmentEntity.get("empls");
    //demo code : companyEnity.attachEvent("onchange", "name", onchange_handler1);
    //demo code : departmentEntity.attachEvent("onchange", "dname", onchange_handler2);
    //demo code : employeeEntity.attachEvent("onchange", "ename", onchange_handler3);
    //yon can attach event on the entity object...
    
}

function nc$bs$oa$oama$ecm$msg_SendMessageController$selectedCallback(ctx){	
	if(!isResume){
		isResume = true;
		ctx.dispose();
		return;
	}
	try
	{
	  var tempName = "";
      var array = getCache();
      array = $stringToJSON(array);
      for (var i = 0;i<array.length;i++)
        {
          tempName+=array[i]["name"]+",";                                     
         }
      if(tempName.length>0)            
       {
         tempName= tempName.substring(0,tempName.length-1);                    
       }
       ctx.load({"recipientNames":tempName});
     }
     catch(e)
	 {
		//为IOS 第一次加载吞掉异常，不建议这么写，但是。。。
	 }  
}

function getCache(){
         var tmp = $cache.readFile("ECMPERSONSELECTED");
         if(tmp==null || tmp=="")
            return [];
         else
            return tmp;
}

function clearCache()
{
	$cache.writeFile("ECMPERSONSELECTED","");
	$cache.writeFile("ATTACHMENTNAME","");
}

function getAttachmentNameCache(){
         return $cache.readFile("ATTACHMENTNAME");           
}

function nc$bs$oa$oama$ecm$msg_SendMessageController$AttachmentCallback(ctx){
	isResume = false;
	var attachmentList = stringToJSON(ctx.params()["attachment"])|| [];
	ctx.load({"attachmentlist" : attachmentList});
	$controls.set("label5", "text", attachmentList.length);
	if(attachmentList.length>0)
		 $cache.writeFile("ATTACHMENTNAME", attachmentList[0]["name"]);
}
function nc$bs$oa$oama$ecm$msg_SendMessageController$SendMessage(ctx){
	var params = getParams(ctx);
	
	var recipients = ctx.get("recipientNames");
	if(!recipients) {
		alert($res.getResString("msg_RecipientIsNull"));//收件人不能为空
		return;
	}
	var msgtitle = ctx.get("msgtitle");
	if (!msgtitle){
		alert("收件人不能为空");//收件人不能为空
		return;
	}
	
	var actionType = ctx.params()["actionType"];
	if (!(actionType == null || actionType == "" || typeof(actionType) == 'undefined')){
	 		params["actionType"] = actionType;
	 		if (actionType == "Transfer"){
            	params["origin_msgid"] = ctx.params()["origin_msgid"]
        	}
	}
	
	var content = ctx.get("content");
	var attachmentName = getAttachmentNameCache();
	if(!attachmentName && !content)
	{
		alert($res.getResString("msg_IsNullContentOrAttach"));//消息内容或附件不能同时为空
		return;
	}
	UM_NativeCall.callService("UMService.callAction", jsonToString(params));
	clearCache();
}

function getParams(ctx){
	var message = ctx.unload();
	var recipientID = "";
	var array = getCache();
    array = $stringToJSON(array);
	for (var i = 0;i<array.length;i++)
	{
		recipientID+=array[i]["id"]+",";
	}
	if(recipientID.length>0)		
	{
		recipientID= recipientID.substring(0,recipientID.length-1);
	}	
	message["recipientNames"] = recipientID ||"";	
	return {
		"viewid" : "nc.bs.oa.oama.msgList.MsgListController",
		"action" : "save",
		"isDataCollect" : "true",
		"callback" : "ExcuteResultDialog",
		"error" : "errorDialog",
		"contextmapping" : "ResultValue",
		"message" : message
	};
}
function  nc$bs$oa$oama$ecm$msg_SendMessageController$onLoadSendType(ctx){
	var params = getSendTypeParams(ctx);
	UM_NativeCall.callService("UMService.callAction", jsonToString(params));
	
	//alert("发送消息界面初始化函数1");
	try{
	 	var actionType = ctx.params()["actionType"];
	 	if (actionType == null || actionType == "" || typeof(actionType) == 'undefined'){
	 		return;
	 	}
	 	//动作类型不为空，说明是回复或者转发
	 	var msgtitle = ctx.params()["msgtitle"];
	 	var content = ctx.params()["content"];
	 	var sendBy = ctx.params()["sendBy"];
	 	var sendDate = ctx.params()["sendDate"];
	 	var senderid = ctx.params()["senderid"];
	 	var receiverid = ctx.params()["receiverid"];
	 	var receiveBy = ctx.params()["receiveBy"];
	 	
	 	var newcontent = "\\r\\n\\r\\n";
	 	newcontent += "----------------------------\\r\\n";
	 	newcontent += "发件人\:" + sendBy + "\\r\\n";
	 	newcontent += "收件人\:" + receiveBy + "\\r\\n";
	 	newcontent += "发送时间\:" + sendDate + "\\r\\n";
	 	newcontent += "发件内容\:" + content + "\\r\\n";
	 	if (actionType == "Reply"){
	 		msgtitle = "回复:" + msgtitle;
	 		ctx.load({"msgtitle":msgtitle,"content":newcontent,"recipientNames":sendBy});
	 		
	 		var array = [];
		 	var autoselectedperson = {
		 			"checked" : true,
		 			"id" : senderid,
		 			"name" : sendBy,
		 			"ListViewSelector" : 1
		 	};
		 	array.push(autoselectedperson);
		 	$cache.writeFile("ECMPERSONSELECTED",array || []);
	 	}else if (actionType == "Transfer"){
	 		msgtitle = "转发:" + msgtitle;
	 		ctx.load({"msgtitle":msgtitle,"content":newcontent});
	 	}
	 }catch(e){
        if(e.stack){
            alert(e.stack);
        }else{
            alert(e.name + ":" + e.message);
        }
    }
};
function getSendTypeParams(ctx){
	var sendType = ctx.unload();
	return {
		"viewid" : "nc.bs.oa.oama.msgList.MsgListController",
		"action" : "GetSendType",
		"callback":"sendTypeCallback",
		"startline" : "1",
		"count" : "25",
		"contextmapping" : "ResultValue",
		"sendtype" : sendType
	};
}
function nc$bs$oa$oama$ecm$msg_SendMessageController$sendTypeCallback(ctx){
	var jSendType = eval(ctx.unload()["ResultValue"]["MsgSendTypeList"][0]);
    var email = jSendType["sendType4Email"];
	var push = jSendType["sendType4Push"];
	var im = jSendType["sendType4Im"];
	var cssms = jSendType["sendType4cssms"];
	if(!email)
	{
		hide("panelEmail");
	}
	else
	{
		setValue("labelEmail",email);
		show("panelEmail");
	}	
	if(!push)
	{
		hide("panelPush");
	}
	else
	{
		setValue("labelPush",push);
		show("panelPush");
	}	
	if(!im)
	{
		hide("panelIM");
	}
	else
	{
		setValue("labelIM",im);
		show("panelIM");
	}	
	if(!cssms)
	{
		hide("panelCSSMS");
	}
	else
	{
		setValue("labelCSSMS",cssms);
		show("panelCSSMS");
	}	
}
function setValue(id,value)
{
	$controls.set(id, "text", value);
}
function show(id){
	$controls.set(id, "visible", "true");
}
function hide(id, isHolder){
	if(isHolder){
		$controls.set(id, "visible", "false");
	}else{
		$controls.set(id, "display", "none");
	}
}
function nc$bs$oa$oama$ecm$msg_SendMessageController$errorDialog(ctx){
	var errMsg = stringToJSON(ctx.params()["err_msg"]);
	if(errMsg){
		var index = errMsg.indexOf(":");
		alert(errMsg.substring(index+1));
	}
}
function nc$bs$oa$oama$ecm$msg_SendMessageController$OnClickCancel(ctx){
	var recipientNames = ctx.unload()["recipientNames"];
	var attachmentlist = 0;
	if(null!=ctx.unload()["attachmentlist"])
	{
		attachmentlist = ctx.unload()["attachmentlist"].length;
	}	
	if( recipientNames || (attachmentlist > 0)) {// 单据内容不为空
		_$sys.callAction('beforeCancel'); // 确认取消
	} else {
		_$sys.callAction('onCloseClick'); // 关闭页面
	}
}
function nc$bs$oa$oama$ecm$msg_SendMessageController$onCloseClick(ctx){
	var params =  {
		"resultcode" : "15",
		"iskeep" : "false"
	};
	clearCache();
	UM_NativeCall.callService("UMView.close", jsonToString(params));	
	
}
function nc$bs$oa$oama$ecm$msg_SendMessageController$OnLoadSendMsg(ctx){
	alert("发送消息界面初始化函数");
}
nc.bs.oa.oama.ecm.msg_SendMessageController.prototype = {
    initialize : nc$bs$oa$oama$ecm$msg_SendMessageController$initialize,
    errorDialog : nc$bs$oa$oama$ecm$msg_SendMessageController$errorDialog,
    onCloseClick :nc$bs$oa$oama$ecm$msg_SendMessageController$onCloseClick,
    OnClickCancel : nc$bs$oa$oama$ecm$msg_SendMessageController$OnClickCancel,
    selectedCallback : nc$bs$oa$oama$ecm$msg_SendMessageController$selectedCallback,
    AttachmentCallback : nc$bs$oa$oama$ecm$msg_SendMessageController$AttachmentCallback,
    onLoadSendType : nc$bs$oa$oama$ecm$msg_SendMessageController$onLoadSendType,
    sendTypeCallback : nc$bs$oa$oama$ecm$msg_SendMessageController$sendTypeCallback,
    SendMessage : nc$bs$oa$oama$ecm$msg_SendMessageController$SendMessage,
    OnLoadSendMsg : nc$bs$oa$oama$ecm$msg_SendMessageController$OnLoadSendMsg
};
nc.bs.oa.oama.ecm.msg_SendMessageController.registerClass('nc.bs.oa.oama.ecm.msg_SendMessageController');
