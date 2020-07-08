package JavaDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Count_triplets_map {
	
	private static long count_triplets(List<Long> arr, long r) {
		
		HashMap<Long,Long> previous= new HashMap<Long,Long>();
		HashMap<Long,Long> next= new HashMap<Long,Long>();
		for(long b: arr) {
			next.put(b,next.getOrDefault(b,0L)+1);
		}
			
		long n=arr.size();
		long sum=0;
		for(int i=0;i<n;i++)
		{
			long a=arr.get(i);
			long left_count=0;
			long right_count=0;
			next.put(a,next.getOrDefault(a,0L)-1);
			if(previous.containsKey(a/r) && a%r==0) {
			left_count=previous.get(a/r);
			}
			if(next.containsKey(a*r)) {
			right_count=next.get(a*r);
			}
			sum+=left_count*right_count;	
			previous.put(a,previous.getOrDefault(a,0L)+1);	
		}
	    return sum;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Long> arr = new ArrayList<Long>();
		arr.add((long) 1);
		arr.add((long) 2);
		arr.add((long) 2);
		arr.add((long) 4);
		
		System.out.println(count_triplets(arr,2));
		

	}

}
