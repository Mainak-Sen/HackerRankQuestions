package JavaDemo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegularExpression {
	
	static String zeroTo255="(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
	//static String zeroTo255="(\\d{1,2}|(0|1)\\d{2}|2[0-5][0-5])";
	static String pattern =zeroTo255+"."+zeroTo255+"."+zeroTo255+"."+zeroTo255;
	
	public static boolean patternchecker(String input) {
		
		//Pattern p = Pattern.compile
		
		if(input.matches(pattern))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		
		System.out.println(patternchecker(s1));
	
		

	}

}
