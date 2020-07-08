package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class rank_it {
	
	private static int get_rank(int[] array,int first,int last,int key) {
		//base cases
		//we will continue until first becomes greater than last(which is non sensical)
		if(first>last)
		{
			return -1;
		}
		else
		{
			int median=(first+last)/2;
			if(key>array[median])
			{
				 return get_rank(array,median+1,last,key);
			}
			else if(key<array[median])
			{
				return get_rank(array,first,median-1,key);
			}
			else
			{
				return median;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int arr_size=s.nextInt();
        int[] array=new int[arr_size];
        for(int i=0;i<arr_size;i++)
        {
        	array[i]=s.nextInt();
        }
        Arrays.sort(array);
        int first=0;
        int last=arr_size-1;
        int queries=s.nextInt();
        int[] ans=new int[queries];
        for(int j=0;j<queries;j++)
        {
        	int no=s.nextInt();
        	ans[j]=get_rank(array,first,last,no)+1;
        }
        for(int a:ans)
        {
        	System.out.println(a);
        }

	}

}
