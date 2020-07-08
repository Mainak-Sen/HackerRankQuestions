package JavaDemo;

import java.util.Scanner;

public class LeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		
		int[] a = new int[n];
		int[] rotarray =new int[n];
		int newindex=0;
		
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
			}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
			
			}
		System.out.println();
		
		for(int oldindex=0;oldindex<n;oldindex++)
		{
			newindex=((n-d)+oldindex)%n;
			rotarray[newindex]=a[oldindex];
		}
		
		for (int j = 0; j < n; j++) {
			System.out.print(rotarray[j]+" ");
		}

	}

}
