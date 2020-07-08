package JavaDemo;

import java.util.Locale;
import java.util.Scanner;

public class StringDemo {
	

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		System.out.println(a.length()+b.length());
		if((a.compareTo(b)>0))
				{
					System.out.println("Yes");
				}
		else
		{
			System.out.println("No");
		}
		
	    System.out.println(a.substring(0,1).toUpperCase()+a.substring(1).toLowerCase()+" "+b.substring(0,1).toUpperCase()+b.substring(1).toLowerCase());
	}

}
