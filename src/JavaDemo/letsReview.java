package JavaDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class letsReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int nt =sc.nextInt();
		ArrayList<String> a=new ArrayList<String>();
		for(int i=0;i<nt;i++)
		{
			 a.add(sc.next());
		}
		
		//System.out.println(a);
	    for(int k=0;k<a.size();k++)
	    {	
	    	String s=a.get(k);
	    	String evenstring="";
			String oddstring="";
			for(int j=0;j<s.length();j++)
			{
				if(j%2==0)
				{
					evenstring=evenstring+s.charAt(j);
				}
				else
				{
					oddstring=oddstring+s.charAt(j);
				}
			}
			System.out.println(evenstring+" "+oddstring);
	    }
		
		/*for(int k=0;k<nt;k++)
		{
			System.out.println(evenstring+" "+oddstring);
		}*/
	}

}
