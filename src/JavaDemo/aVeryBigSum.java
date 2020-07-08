package JavaDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class aVeryBigSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//long sum=0;
		    
		    List<List<Integer>> list = new ArrayList<List<Integer>>();
		    
		    ArrayList<Integer> a1=new ArrayList<Integer>();
		    ArrayList<Integer> a2=new ArrayList<Integer>();
		    ArrayList<Integer> a3=new ArrayList<Integer>();
		    //ArrayList<Integer> a4=new ArrayList<Integer>();
		   //ArrayList<Integer> a5=new ArrayList<Integer>();
		    
		    a1.add(1);
		    a1.add(2);
		    a1.add(3);
		    
		    a2.add(4);
		    a2.add(5);
		    a2.add(6);
		    
		    a3.add(9);
		    a3.add(8);
		    a3.add(9);
		    
		    list.add(a1);
		    list.add(a2);
		    list.add(a3);
		    
		    
		    System.out.println(list);
		    
		    /*for(int i=0;i<list.size();i++)
		    {
		    	for(int j=0;j<list.get(i).size();j++)
		    	{
		    		if(!(a4.contains(list.get(i).get(i))))
		    		{
		    			a4.add(list.get(i).get(i));
		    		}
		    	}
		    
		    }
		    
		    System.out.println(a4);
		    Collections.reverse(list);
		    
		    for(int i=0;i<list.size();i++)
		    {
		    	for(int j=0;j<list.get(i).size();j++)
		    	{
		    		if(!(a5.contains(list.get(i).get(i))))
		    		{
		    			a5.add(list.get(i).get(i));
		    		}
		    	}
		    
		    }
		    
		    System.out.println(a5);
		    int disum1=0;
		    int disum2=0;
		    
		    for(int i=0;i<a4.size();i++)
		    {
		    	disum1+=a4.get(i);
		    
		    }
		    
		    for(int i=0;i<a5.size();i++)
		    {
		    	disum2+=a5.get(i);
		    
		    }
		    
		    System.out.println(Math.abs(disum1-disum2));*/
		
		
		int disum1=0;
	    int disum2=0;
	    for(int i=0;i<list.size();i++)
	    {
	    		disum1+=list.get(i).get(i);
	    		disum2+=list.get(i).get((list.size()-1)-i);
	    }   
		    
		    
	    System.out.println(Math.abs(disum1-disum2));    
		    
		    
	}

}


/*for(int i = 0, j = n-1; i < n; i++, j--){
    sum1 += a[i][i];
    sum2 += a[j][i];
}
or as

for(int i = 0; i < n; i++){
    sum1 += a[i][i];
    sum2 += a[(n-1)-i][i];
}*/
