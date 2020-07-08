package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Regex_Practice {

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        ArrayList<String> f_name=new ArrayList<String>();
        
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
            
            if(emailID.matches("\\S+@gmail.com"))
            {
                f_name.add(firstName);
            }

        }
        Collections.sort(f_name);
        System.out.println(f_name);
        for(String fn:f_name)
        {
            System.out.println(fn);
        }


        scanner.close();
    }
}
