package JavaDemo;

import java.util.ArrayList;
import java.util.List;

public class Count_triplets {
	private static long count_triplets(List<Long> arr, long r) {
		long count=0;
		for(int i=0;i<arr.size();i++)
		{	
			for(int j=i+1;j<arr.size();j++)
			{
				for(int k=j+1;k<arr.size();k++)
				{
					if(arr.get(k)/arr.get(j)==r && arr.get(j)/arr.get(i)==r)
					{
						count++;
					}
				}
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Long> arr = new ArrayList<Long>();
		arr.add((long) 1);
		arr.add((long) 2);
		arr.add((long) 2);
		arr.add((long) 4);
		//arr.add((long) 125);
		//arr.add((long) 81);
		
		System.out.println(count_triplets(arr,2));
		
	}

}
