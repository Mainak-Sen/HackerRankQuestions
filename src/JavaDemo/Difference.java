package JavaDemo;

import java.util.Scanner;

public class Difference {
  	private int[] elements;
  	public int maximumDifference;
  	
  	public Difference(int[] a) {
  		this.elements=a;
  	}
  	
  	public int computeDifference() {
  		maximumDifference=0;
  		for(int i=0;i<=elements.length-1;i++) {
  			for(int j=i+1;j<=elements.length-1;j++) {
  			int difference=(Math.abs(elements[i]-elements[j]));
  			if(difference>maximumDifference) {
  				maximumDifference=difference;
  			}
  			}
  		}
  		
  		return maximumDifference;
  	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);

	}

}
