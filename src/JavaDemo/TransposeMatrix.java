package JavaDemo;

import java.util.Iterator;
import java.util.Scanner;

public class TransposeMatrix {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns:");
		int columns = sc.nextInt();
		
		int[][] A= new int[rows][columns];
		
		//Array Before Transpose
	    for(int i=0;i<rows;i++)
	    {
	    	for(int j=0;j<columns;j++)
	    	{
	    		A[i][j]=sc.nextInt();
	    	}
	    }
	    
	  //Matrix Before Transpose
	    for(int i=0;i<rows;i++)
	    {
	    	for(int j=0;j<columns;j++)
	    	{
	    		System.out.print(A[i][j]+" ");
	    	}
	    	System.out.println();
	    } 
	    
	  //Matrix After Transpose
	    
	    for(int i=0;i<rows;i++)
	    {
	    	for(int j=0;j<columns;j++)
	    	{
	    		System.out.print(A[j][i]+" ");
	    	}
	    	System.out.println();
	    } 

}
}
