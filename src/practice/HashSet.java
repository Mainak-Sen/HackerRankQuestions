package practice;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class HashSet {

	public static void main(String[] args) {
		   Scanner s = new Scanner(System.in);
	        int t = s.nextInt();
	        s.nextLine();
	        String [] pair_left = new String[t];
	        String [] pair_right = new String[t];
	      LinkedHashSet<Object> set=new LinkedHashSet<Object>();
	        for (int i = 0; i < t; i++) {
	            pair_left[i] = s.next();
	            pair_right[i] = s.next();
	            String full_name=pair_left[i]+" "+pair_right[i];
	            set.add(full_name);
	            System.out.println(set.size());
	        }       

	}

}
