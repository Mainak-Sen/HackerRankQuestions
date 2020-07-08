package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		//Enter the number of lines
		int n= in.nextInt();
		//for each of the next n number of lines,the first intger should represent size of the array followed by
		//same number of space separated integers
		//Creating an array-list of array-list which implies
		
		ArrayList<ArrayList<Integer>> num_array=new ArrayList<ArrayList<Integer>>(n);
		//remember scanner.next always looks for a next value delimited by spaces 
		for(int i=0;i<n;i++)
		{
			int d=in.nextInt();
			ArrayList<Integer> num=new ArrayList<Integer>(d);
			for(int j=0;j<d;j++)
			{
				num.add(in.nextInt());
			}
			num_array.add(num);
		}
		
		int q=in.nextInt();
		for(int k=0;k<q;k++)
		{
			int x=in.nextInt();
			int y=in.nextInt();
			
			try {
				System.out.println(num_array.get(x-1).get(y-1));
			}
			catch(Exception e)
			{
				System.out.println("ERROR!");
			}
			
		}
	
	}

}
