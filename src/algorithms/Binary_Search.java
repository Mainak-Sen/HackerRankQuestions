package algorithms;

public class Binary_Search {

	private static int binary_search(int[] array,int first,int last,int key) {
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
				 return binary_search(array,median+1,last,key);
			}
			else if(key<array[median])
			{
				return binary_search(array,first,median-1,key);
			}
			else
			{
				return median;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mandatory to give sorted array as input for binary search,else algorithm won't work;
		int[] sorted_array= {1,2,3,4,9};
		int last=sorted_array.length-1;
		System.out.println(binary_search(sorted_array,0,last,9));

	}

}
