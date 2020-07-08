package practice;

import java.util.ArrayList;

public class Longest_repeating_sequence {
	
	//since we are concerned about character sequence ,so sequence should be at least containing 2 characters
	
	
	private static String longest_repeating_sequence(String a) {
		
	ArrayList<String> as=new ArrayList<String>();
	ArrayList<String> repeat_array=new ArrayList<String>();
	for (int i=0;i<=a.length();i++)
	{
		for (int j=i+1;j<=a.length();j++)
		{   
			if(a.substring(j).contains(a.substring(i,j))) {
				if(!as.contains(a.substring(i,j))) {
				as.add(a.substring(i,j));
				}
			}
		}
	}
	String temp_longest="";
	for (int i=0;i<as.size();i++)
	{
		  if(as.get(i).length()>temp_longest.length())
		  {
			  temp_longest=as.get(i);
		  }
	}
	
	return temp_longest;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longest_repeating_sequence("mothermammothbhfgdjmothmothermammothvbjk"));
		
	}

}
