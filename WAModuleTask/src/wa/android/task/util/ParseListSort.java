package wa.android.task.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ParseListSort {

	@SuppressWarnings({ "unchecked" })
	public static List<String> ParseList(List<String> datalist){
		List<String> resultDataList = new ArrayList<String>();
		List<String> tmpDataList = new ArrayList<String>();
		for(int i = 0 ; i <datalist.size() ; i++){
			if(datalist.get(i).length()<10){
				resultDataList.add(datalist.get(i));
			}
			else{
				tmpDataList.add(datalist.get(i));
			}
		}
		ListSortUtil sort = new ListSortUtil();
		Collections.sort(tmpDataList,sort);
		for (int j= tmpDataList.size()-1 ; j >= 0 ; j--){
			resultDataList.add(tmpDataList.get(j));
		}
		return resultDataList;
		
	}
	
	@SuppressWarnings("unchecked")
	public static List<Map<String, String>> ParseSubList(List<Map<String, String>> datalist){
		List<Map<String, String>> resultDataList = new ArrayList<Map<String, String>>();
		List<Map<String, String>> tmpDataList = new ArrayList<Map<String, String>>();
		for(int i = 0 ; i <datalist.size() ; i++){
//			if(datalist.get(i).get("date").length()<10){
//				resultDataList.add(datalist.get(i));
//			}
//			else{
				tmpDataList.add(datalist.get(i));
//			}
		}
		SubListSortUtil sort = new SubListSortUtil();
		Collections.sort(tmpDataList,sort);
		for (int j= 0 ; j< tmpDataList.size() ; j++){
			resultDataList.add(tmpDataList.get(j));
		}
		return resultDataList;
		
	}
}
