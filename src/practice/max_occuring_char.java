package practice;

import java.util.ArrayList;

public class max_occuring_char {
	public static char max_occuring_char(String a) {
		ArrayList<Character> ac= new ArrayList<Character>();
		int max=0;
		char temp=0;
		for(int i=0;i<a.length();i++)
		{	int count=1;
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
			if(count>max)
			{           
				        max=count;
				        temp=a.charAt(i);
						
			}
		}
		System.out.println("Max count is:"+max);
		System.out.println("Duplicate characters are :"+ac);
		return temp;
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Maximum occuring character is :"+max_occuring_char("xyzcvfxxyyyfv"));
		
	}

}
