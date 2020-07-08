package JavaDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Binary {
	
private static int BinaryNumberConsecutive1(int n) {
		
			ArrayList<Integer> Binarynumber= new ArrayList<Integer>();
			int j=0;
			
			while(n>0)
			{
				Binarynumber.add(n%2);
				n=n/2;
				j++;
			}
			
			/*for (int i = Binarynumber.size()-1; i>=0; i--) {
				
				System.out.print(Binarynumber.get(i));
			}*/
			
			Collections.reverse(Binarynumber);
			//System.out.println(Binarynumber);
			//return Binarynumber;
			int counter=0;
			int max=0;
			ArrayList<Integer> a = new ArrayList<Integer>();
			for (int i = 0; i < Binarynumber.size(); i++) {
				if(Binarynumber.get(i)==0)
				{
					counter=0;
				}
				else
				{
					counter++;
					if(counter>max)
					{
						max=counter;
					}
					
				}
			}
			
			return max;
			
		
		}


	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number you want to display maximum consecutive 1'sof its binary:");
		int num = sc.nextInt();
		System.out.println(BinaryNumberConsecutive1(num));
	}

}
