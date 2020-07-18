package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Result2 {
	
	public static List<String> compare_frnds(List<String> frnds_List){
		HashMap<String,String> hm=new LinkedHashMap<String,String>();
		HashMap<String,String> sorted_hm=new LinkedHashMap<String,String>();
		for(int i=0;i<frnds_List.size();i++)
		{
			hm.put(frnds_List.get(i).split(",")[0],frnds_List.get(i).split(",")[1]);
		}
	    List<Map.Entry<String,String>> l=new LinkedList<Map.Entry<String,String>>(hm.entrySet());
	    Collections.sort(l,new Comparator<Map.Entry<String,String>>(){

			@Override
			public int compare(Entry<String, String> o1, Entry<String,String> o2) {
				// TODO Auto-generated method stub
				return o1.getKey().compareTo(o2.getKey());
			}});
	    for(Map.Entry<String,String> each :l)
	    {
	    	if(!((sorted_hm.containsKey(each.getKey())&& sorted_hm.containsValue(each.getValue())) || (sorted_hm.containsValue(each.getKey())&& sorted_hm.containsKey(each.getValue()))))
	    	sorted_hm.put(each.getKey(),each.getValue());
	    }
	    ArrayList<String> al_sorted_FrndsListUnique=new ArrayList<String>();
	
	    	for(Entry<String,String> each: sorted_hm.entrySet() )
	    	{
	    		al_sorted_FrndsListUnique.add(each.getKey()+","+each.getValue());
	    	}
	    	
	    	return al_sorted_FrndsListUnique;
	
	    	
  }
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> friends_list=new ArrayList<String>();
		friends_list.add("MARY,JOE");
		friends_list.add("JOE,MARY");
		friends_list.add("A,B");
		friends_list.add("Auro,Brinda");
		friends_list.add("JOE,MARY");
		
		System.out.println(compare_frnds(friends_list));

	}

}
