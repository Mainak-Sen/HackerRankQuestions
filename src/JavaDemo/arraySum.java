package JavaDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<>(Arrays.asList(17,28,30));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(99,16,8));
		int csA=0;
		int csB=0;
		List<Integer> list3 = new ArrayList<>();
		
		
		for(int i=0;i<list1.size();i++)
		{
			if(list1.get(i)!=list2.get(i))
			{
				if(list1.get(i)>list2.get(i))
				{
					csA++;
				}
				else
				{
					csB++;
				}
			}
			
		}
		
		list3.add(csA);
		list3.add(csB);
		System.out.println(list3);
		
	}

}
