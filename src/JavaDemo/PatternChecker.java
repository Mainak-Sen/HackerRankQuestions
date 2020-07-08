package JavaDemo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		String pat;
		ArrayList<String> a= new ArrayList<String>();
		while(testCases>0){
			pat = in.nextLine();
			a.add(pat);
			testCases=testCases-1;
		}
		
		for(int i=0;i<a.size();i++)
		{
			try
			{
			Pattern pt = Pattern.compile(a.get(i));
			System.out.println("Valid");
			}
			catch(PatternSyntaxException p)
			{
				System.out.println("Invalid");
			}
		}
		}
		
			
          	//Write your code
		
	}




