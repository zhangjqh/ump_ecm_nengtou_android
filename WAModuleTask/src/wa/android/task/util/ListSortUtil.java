package wa.android.task.util;


import android.annotation.SuppressLint;
import java.text.SimpleDateFormat;
import java.util.Comparator;

@SuppressLint("SimpleDateFormat")
@SuppressWarnings("rawtypes")
public class ListSortUtil implements Comparator {

	@SuppressLint("SimpleDateFormat")
	@Override
	public int compare(Object arg0, Object arg1) {
	    String dateFirst = ((String)arg0).replace(":", "").replace("-", "").replace(" ", "");
	     String dateSecond = ((String)arg1).replace(":", "").replace("-", "").replace(" ", "");
//		if(((String)arg0).contains(":")){
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
//         dateFirst =sdf.format(arg0) ;    
//         dateSecond=sdf.format(arg1) ; } 
//		else{
//			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//	         dateFirst =sdf.format(arg0) ;    
//	         dateSecond=sdf.format(arg1) ;  	
//		}
//		  int flag =  java.sql.Date.valueOf(dateFirst).compareTo( java.sql.Date.valueOf(dateSecond));
		 int flag =  dateFirst.compareTo(dateSecond);
		  return flag;
	}

}
