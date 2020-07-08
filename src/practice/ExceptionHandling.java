package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z=x/y;
        System.out.println(z);
        }
        catch(InputMismatchException e)
        {
            System.out.print(e.getClass().getName());
        }
        catch(Exception e)
        {
        	System.out.print(e);
        }

	}

}
