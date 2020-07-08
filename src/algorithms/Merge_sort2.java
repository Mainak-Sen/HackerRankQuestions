package algorithms;

public class Merge_sort2 {
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
			if(larray[l]<rarray[r])
			{
				array[i++]=larray[l++];
			}
			else
			{
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
		int Array[]= {5,9,3,4,9,44,32,76};
		int size=Array.length;
		merge_sort(Array,size);
		
		for(int m: Array)
		{
			System.out.print(m+" ");
		}

	}

}
