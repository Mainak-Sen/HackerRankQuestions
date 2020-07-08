package practice;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;

public class Max_Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a HashMap and add some values 
	      Scanner in = new Scanner(System.in);
          Deque<Integer> deque = new ArrayDeque<>();
          HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
          int n = in.nextInt();
          int m = in.nextInt();
          int max=hm.size();

          for (int i = 0; i < n; i++) {      	
              //removing old
              if(i>=m)
              {
            	  int old=deque.remove();
            	  //to discard this old already checked value ,we need to remove its corresponding occurrence from Map
            	  if(hm.get(old)==1)
            	  {
            		  hm.remove(old);
            	  }
            	  else
            	  {
            		  hm.put(old,hm.get(old)-1);
            	  }
              }
              //adding new 
              int num = in.nextInt();
              deque.add(num);
              hm.merge(num,1,Integer::sum);
              max=Math.max(max,hm.size());
              //breaking out of loop if all integers are unique,which is the maximum possible,no need to check other iterations
              if(max==m)
              {
            	  break;
              }
             
          }
          
          System.out.println(max);
	}

}
