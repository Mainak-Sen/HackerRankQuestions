package practice;

import java.math.BigInteger;
import java.util.Scanner;

public class primality_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();

        sc.close();
        BigInteger bg=new BigInteger(n);
        if(bg.isProbablePrime(1))
        {
        	System.out.println("prime");
        }
        else
        {
        	System.out.println("not prime");
        }

	}

}
