package algorithms;

public class LinearSearchinArray {
	
	private static int Linear_search(int[] arr,int index,int number) {
		//base case
		if(arr[index]==number)
		{
			return index;
		}
		else {
			return Linear_search(arr,index+1,number);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Array = {7,6,5,8,3,4};
		System.out.println(Linear_search(Array,0,3));

	}

}
