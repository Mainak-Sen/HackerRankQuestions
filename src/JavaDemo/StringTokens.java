package JavaDemo;

import java.util.Scanner;
public class StringTokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        // Write your code here.
        if(s.length()==0)
        {
          System.out.println(0);
        }
        else
        {
        String delims ="[ !,?._'@]+";
        String tokens[]= s.trim().split(delims);
        if(tokens.length==0)
        {
            System.out.println(0);
        }
        else
        {
         //tokens= s.trim().split("[\\p{Space}]+");
        System.out.println(tokens.length);
        for(String t: tokens)
            {
                System.out.println(t);
            }
        }
        
    }
        scan.close();
	}
}


