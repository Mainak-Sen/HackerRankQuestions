package JavaDemo;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String B ="";
        for(int i=(A.length()-1);i>=0;i--)
        {
        	B=B+A.charAt(i);
        }
        if(B.equals(A))
        {
        	System.out.println("Yes");
        }
        else
        {
        	System.out.println("No");
        }
	}

}
