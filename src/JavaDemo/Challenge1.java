package JavaDemo;


import java.util.Scanner;

public class Challenge1 {

	 public static void main(String[] args){
	        
		 /*Scanner s = new Scanner(System.in);
			
			int N = s.nextInt();
			
			// Define an array of integers of size N. 
			int[] numArray = new int[N];		
			

			int sum = 0;
			for(int i=0; i<N; i++){
				numArray[i] = s.nextInt(); // Get the input
			}
		    
		    // Write the logic to add these numbers here:
		    for(int i=0; i<N; i++){
				sum=sum+numArray[i]*numArray[i];
			}
		    
		    
		    
			// Print the sum
			System.out.print(sum);
			s.close();
		 
			Scanner s = new Scanner(System.in);
		    
		    // Get L and R from the input
			int L = s.nextInt();
			int R = s.nextInt();
	    
	        // Write here the logic to print all integers between L and R
	        
	        for(int i=L;i<=R;i++)
			{
				System.out.print(i+"\t");
			}
	        
	        
	        

			s.close();*/
			Scanner s = new Scanner(System.in);
			
			// Reading integer from input
			int N = s.nextInt();
			
			int[] numArrayA = new int[N];
			int[] numArrayB = new int[N];
			int[] sumArray = new int[N];
					
			// Read numArray1
			for(int i=0; i<N; i++) {
				numArrayA[i] = s.nextInt();
			}
			// Read numArray2
			for(int i=0; i<N; i++) {
				numArrayB[i] = s.nextInt();
			}
			
			// Write your logic here:
			for(int i=0; i<N; i++) {
				sumArray[i]=sumArray[i]+(numArrayA[i]+numArrayB[i]);
			}
			
			
			
			
			// Print the sumArray
			for(int i=0; i<N; i++) {
				System.out.print(sumArray[i] + " ");
			}
	        
	        System.out.println();
			s.close();
		}
	  

	}

