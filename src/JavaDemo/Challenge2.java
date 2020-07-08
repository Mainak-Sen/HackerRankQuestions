package JavaDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Challenge2 {

	 public static void main(String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        //System.out.println("Enter Integer");
	        int i = Integer.parseInt(br.readLine());
	        //System.out.println("Enter Double");
	        double d = Double.parseDouble(br.readLine());
	        //System.out.println("Enter String");
	        String s = br.readLine();
	       /*Scanner sc = new Scanner(System.in);
	       int i = sc.nextInt();
	       Double d =sc.nextDouble();
	       //sc.nextLine();
	       String s = sc.nextLine();*/
	       
	        


	        // Write your code here.

	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	       
	    }

	}

