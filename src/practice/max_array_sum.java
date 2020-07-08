package practice;

public class max_array_sum {
	
	private static int max_array_sum(int[] arr)
	{
		if(arr.length==0)
		{
			return 0;
		}
		else if(arr.length==1)
		{
			return arr[0];
		}
		else if(arr.length==2)
		{
			return Math.max(arr[0],arr[1]);
		}
		else
		{
			int[] max_with_position=new int[arr.length];
			max_with_position[0]=arr[0];
			max_with_position[1]=Math.max(arr[0],arr[1]);
			int currmax=max_with_position[1];
			
			for(int i=2;i<arr.length;i++)
			{
				currmax=Math.max((max_with_position[i-2]+arr[i]),currmax);
				currmax=Math.max(arr[i],currmax);
				max_with_position[i]=currmax;
			}
			
			return max_with_position[arr.length-1];
			
		}
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,1,5,8,4};
		System.out.println(max_array_sum(a));

	}

}
