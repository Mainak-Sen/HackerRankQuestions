package practice;

import java.util.BitSet;
import java.util.Scanner;

public class Java_bitset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//Enter the size of each bitset
		int size=sc.nextInt();
		//Create two bitsets with bits initialized to 0(by default) of the above size 
		BitSet bs1=new BitSet(size);
		BitSet bs2=new BitSet(size);
		int n_ops=sc.nextInt();
	    while(n_ops>0) {
	    	String s=sc.next();
	    	int j=sc.nextInt();
	    	int k=sc.nextInt();
	    	switch (s) {
			case "AND" :if(j==1) {bs1.and(bs2);} else {bs2.and(bs1);}
				        break;
			case "OR"  :if(j==1) {bs1.or(bs2);} else {bs2.or(bs1);}
	                    break;	
			case "XOR" :if(j==1) {bs1.xor(bs2);} else {bs2.xor(bs1);}
                        break;
			case "FLIP":if(j==1) {bs1.flip(k);} else {bs2.flip(k);}
				        break;
			case "SET" :if(j==1) {bs1.set(k);} else {bs2.set(k);}
			            break;
			default    :;		
			}
	    	System.out.println(bs1.cardinality()+" "+bs2.cardinality());
	    	n_ops--;
	    }
	}
}
