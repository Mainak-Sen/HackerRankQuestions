package practice;

import java.util.Scanner;

public class Primality_Test2 {
	
	private static boolean is_prime(int no) {
		
		if(no==2)
		{
			return true;//2 is always prime
		}
		else if(no==1||no%2==0)
		{
			return false;// Since 1 is not a prime number  and all even numbers are "not prime"
		}
		else
		{//checking for odd numbers 
		for(int i=3;i*i<=no;)
		{
			if(no%i==0)
			{
				return false;
			}
			i+=2;
		}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int[] nos=new int[n];
		for(int i=0;i<n;i++)
		{
			nos[i]=in.nextInt();
		}
	    
		//If a number is divisible by another number less than or equal to the sq.root of the first number,then the number is not prime 
		
		for(int j=0;j<n;j++)
		{
			if(is_prime(nos[j]))
			{
				System.out.println("Prime");
			}
			else
			{
				System.out.println("Not Prime");
			}
		}

		

	}

}
