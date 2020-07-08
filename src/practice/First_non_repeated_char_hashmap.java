package practice;

import java.util.HashMap;

public class First_non_repeated_char_hashmap {
	//doing the same program to print the first non repeated character using hashmap;
	
	private static  char first_non_repeated_char(String input)
	{
		HashMap<Character,Integer> previous=new HashMap<Character,Integer>();
		HashMap<Character,Integer> next=new HashMap<Character,Integer>();
		int n=input.length();
		for(char c: input.toCharArray())
		{
			next.put(c,next.getOrDefault(c,0)+1);	
		}
		//System.out.println(next);
		char temp=0;
		for(int i=0;i<n;i++)
		{
			char c=input.charAt(i);
			next.put(c,next.getOrDefault(c,0)-1);
			if((previous.getOrDefault(c,0)==0) && (next.getOrDefault(c,0)==0))
			{    
				temp=c;
				break;
			}
			else
			{
				previous.put(c,previous.getOrDefault(c,0)+1);
			}	
		}
		//System.out.println(next);
		//System.out.println(previous);
		return temp;	
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println(first_non_repeated_char("xbcbbbxcy"));
	}

}
