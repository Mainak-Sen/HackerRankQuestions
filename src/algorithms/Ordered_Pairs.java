package algorithms;

import java.util.Scanner;

public class Ordered_Pairs {
	static long count=0;
	public static void merge_sort(int[] array,int size) {
		
		if(size<2)
		{
			return;
		}
		
			int mid=size/2;
			int [] larray=new int[mid];
			int [] rarray=new int[size-mid];
			int k=0;
			for(int i=0;i<size;++i)
			{
				if(i<mid)
				{
					larray[i]=array[i];
				}
				else
				{
					rarray[k]=array[i];
					k=k+1;
				}
			}
			merge_sort(larray,mid);
			merge_sort(rarray,size-mid);
			merge(larray,rarray,array,mid,size-mid);
		
	}
	
	public static void merge(int[] larray,int[] rarray,int[] array,int left_size,int right_size) {
		
		int l=0,r=0,i=0;	
		while(l<left_size && r<right_size) {
			if(larray[l]<=rarray[r])
			{
				array[i++]=larray[l++];
			}
			else
			{
				count+=(long)(((left_size+right_size)/2)-l);
				array[i++]=rarray[r++];
			}
		}
			
			while(l<left_size)
			{
				array[i++]=larray[l++];
			}
			while(r<right_size)
			{
				array[i++]=rarray[r++];
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
        merge_sort(array,arr_size);
        System.out.println(count);

	}

}
