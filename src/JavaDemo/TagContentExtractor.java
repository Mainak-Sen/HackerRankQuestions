package JavaDemo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			boolean is_match_found=false;
			String regex="<(.+)>([^<]+)</\\1>";
			Pattern p=Pattern.compile(regex);
			Matcher m=p.matcher(line);
			while(m.find()) {
				System.out.println(m.group(2));
				is_match_found=true;
			}
			if(!is_match_found)
			{
				System.out.println("None");
			}
			
			testCases--;
		}
		in.close();
	}

}
