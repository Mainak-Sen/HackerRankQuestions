package practice;

import java.util.ArrayList;
import java.util.List;

public class result {
	
	public static List<String> processStrings(String str1, String str2) {
	List<String> output_list=new ArrayList<String>();
	String output1="";String output2="";
	for(char c: str1.toCharArray())
	{
		if(!(str2.contains(c+""))) {
		if(!(output1.contains(c+"")))
		{
			output1=output1+c;
		}
		}
	}
	output_list.add(output1);
	for(char c: str2.toCharArray())
	{
		if(!(str1.contains(c+""))) {
		if(!(output2.contains(c+"")))
		{
			output2=output2+c;
		}
		}
	}
	output_list.add(output2);
	return output_list;
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(processStrings("ABC","BC"));
		System.out.println(processStrings("BC","BANGALORE"));

	}

}
