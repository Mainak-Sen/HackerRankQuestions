package Recursion;

import java.util.Scanner;

public class Hacker {
	
	private static boolean is_hack_possible(long N) {
		//base cases
		if(N==1)
		{
			return true;
		}
		else if(N==10 || N==20)
		{
			return true;
		}
		else if(N%20==0)
		{
			return is_hack_possible(N/20);
		}
		else if(N%10==0)
		{
			return is_hack_possible(N/10);
		}
		else
		{
			return false;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int t=in.nextInt();
		String[] a=new String[t];
		for(int i=0;i<t;i++)
		{
			long N=in.nextLong();
			if(is_hack_possible(N))
			{
				a[i]="Yes";
			}
			else
			{
				a[i]="No";
			}
		}
		
		for(String s: a)
		{
			System.out.println(s);
		}

	}

}
