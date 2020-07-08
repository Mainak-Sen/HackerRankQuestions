package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sub_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int count=0;
		for(int j=0;j<a.length;j++)
		{   int sum=0;
			for(int k=j;k<a.length;k++)
			{
			    sum+=a[k];
				if(sum<0)
				{
					count++;
				}
			}
		}	
		System.out.println(count);
		
	
}
}
