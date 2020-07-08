package JavaDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class AlternatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			String input =in.nextLine();
			//int delcount=0;
			ArrayList<Character> a=new ArrayList<Character>();
			for(int i=0;i<input.length()-1;i++)
			{
				if(input.charAt(i)==input.charAt(i+1))
				{
					a.add(input.charAt(i));
				}
			}
			
			System.out.println(a.size());
	}

}
