package practice;

import java.util.ArrayList;

public class first_non_repeated_char {
	
	public static char first_non_repeating_char(String a) {
		ArrayList<Character> ac= new ArrayList<Character>();
		char temp=0;
		for(int i=0;i<a.length();i++)
		{	int count=0;
			for(int j=i+1;j<a.length();j++)
			{
				if(a.charAt(i)==a.charAt(j))
				{
					count++;
					if(!ac.contains(a.charAt(i))) {
						ac.add(a.charAt(i));
					}
					
				}
			}
			if(count==0 && !ac.contains(a.charAt(i)))
			{
				        temp=a.charAt(i);
						break;
						
			}
		}
		return temp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(first_non_repeating_char("abcbbb"));

	}

}
