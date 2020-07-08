package JavaDemo;

import java.util.HashMap;
import java.util.Scanner;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> myMap = new HashMap<String,Integer>(); 
        //System.out.println("Enter the details:");
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            //in.nextLine();
            myMap.put(name, phone);
        }
        //System.out.println("Query the directory:");
        while(in.hasNext()){
            String s = in.next();
            if(myMap.containsKey(s))
            	System.out.println(s + "=" + myMap.get(s));
                
            else {
            	System.out.println("Not found");
            }
        }
        in.close();
	    }

	}


