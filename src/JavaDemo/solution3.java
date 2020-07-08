package JavaDemo;

import java.util.ArrayList;

public class solution3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ababcghabcxbjjghjhbnvjfhxxcf";
		ArrayList<Character> a=new ArrayList<Character>();
		for(char c:s.toCharArray())
		{
			if(!a.contains(c))
			{
			a.add(c);
			}
		}
		System.out.println(a.size());


	}

}
