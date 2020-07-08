package JavaDemo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberofPureIntegers {

    // Function to return the modified string 
    static String extractInt(String str) 
    { 
        // Replacing every non-digit number 
        // with a space(" ") 
        str = str.replaceAll("[^\\d]", " "); 
  
        // Remove extra spaces from the beginning 
        // and the ending of the string 
        str = str.trim(); 
  
        // Replace all the consecutive white 
        // spaces with a single space 
        str = str.replaceAll(" +", " "); 
  
        if (str.equals("")) 
            return "-1"; 
  
        return str;
    } 
	

    	

    public static void main(String[] args) {
    /*{ 
        String str = "I have 4 numbers,they are 4,6,7.7 and 5.75 respectively."; 
        System.out.print(extractInt(str)); 
    }*/
    	Scanner sc= new Scanner(System.in);
    	String s= sc.nextLine();
    	System.out.println(extractInt(s));
}
}
