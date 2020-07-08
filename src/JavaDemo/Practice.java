package JavaDemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//import for Scanner and other utility classes
//import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class Practice{
	public static void main(String[] args) throws Exception, IOException 
    {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); 
        String S = br.readLine(); 
                   // Reading input from STDIN
        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        //Scanner s = new Scanner(System.in);
        //String name = s.nextLine();                 // Reading input from STDIN
        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        System.out.println(N*2);
        System.out.println(S);
	}
}
