package practice;

import java.math.BigInteger;
import java.util.Scanner;

public class Big_Integer_Ops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
        sc.close();
        BigInteger bga=new BigInteger(a);
        BigInteger bgb=new BigInteger(b);
        
        System.out.println(bga.add(bgb));
        System.out.println(bga.multiply(bgb));
        
        
        
	}

}
