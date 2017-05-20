package wa.android.task.util;

import android.annotation.SuppressLint;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Map;


@SuppressLint("SimpleDateFormat")
@SuppressWarnings({ "unchecked", "rawtypes" })
public class SubListSortUtil implements Comparator {

	@SuppressLint("SimpleDateFormat")
	@Override
	public int compare(Object arg0, Object arg1) {
		String dateFirst = ((Map<String, String>)arg0).get("date").replace(":", "").replace("-", "").replace(" ", "");
		String dateSecond = ((Map<String, String>)arg1).get("date").replace(":", "").replace("-", "").replace(" ", "");
		 int flag =  dateSecond.compareTo(dateFirst);
		  return flag;
	}

}
