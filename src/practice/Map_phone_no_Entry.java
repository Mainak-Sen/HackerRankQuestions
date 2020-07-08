package practice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Map_phone_no_Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		HashMap<String,Integer> hm=new HashMap<String,Integer>(n);
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
			hm.put(name, phone);
		}
		Set<Entry<String,Integer>> entries =hm.entrySet();
		while(in.hasNext())
		{
			String s=in.nextLine();
		    	if(hm.containsKey(s))
		    	{
		    		System.out.println(s+"="+hm.get(s));
		    	}
		    	else
		    	{
		    		System.out.println("Not found");
		    }
		}

	}

}
