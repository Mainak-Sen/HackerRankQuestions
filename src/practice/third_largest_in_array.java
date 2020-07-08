package practice;

public class third_largest_in_array {
	
	private static void third_largest_in_array(int[] a) {
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>a[i])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		
		for(int x: a)
		{
			System.out.print(x+" ");//sorted array in desc_order
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//program to print the 3rd largest number in array
		int[] b={1, 2, 3, 3, 56, 676, 34, 99};
		third_largest_in_array(b);
		
	}

}
