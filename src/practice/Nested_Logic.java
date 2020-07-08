package practice;

import java.util.Scanner;

public class Nested_Logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String return_date=in.nextLine();
		String due_date=in.nextLine();
		
		String[] rtrn_dt=return_date.split(" ");
		String[] due_dt=due_date.split(" ");
		
		if(Integer.parseInt(rtrn_dt[2])>Integer.parseInt(due_dt[2]))
			{
			  System.out.println("10000");
			}
		else if(Integer.parseInt(rtrn_dt[2])<Integer.parseInt(due_dt[2]))
		{
		  System.out.println("0");
		}
		else if(Integer.parseInt(rtrn_dt[1])>Integer.parseInt(due_dt[1]) 
				&& Integer.parseInt(rtrn_dt[2])==Integer.parseInt(due_dt[2]))
				{
			    System.out.println((Integer.parseInt(rtrn_dt[1])-Integer.parseInt(due_dt[1]))*500);
				}
		else if(Integer.parseInt(rtrn_dt[1])<Integer.parseInt(due_dt[1]) 
				&& Integer.parseInt(rtrn_dt[2])==Integer.parseInt(due_dt[2]))
				{
			    System.out.println("0");
				}
		else if(Integer.parseInt(rtrn_dt[0])>Integer.parseInt(due_dt[0]) && Integer.parseInt(rtrn_dt[1])==Integer.parseInt(due_dt[1]) 
				&& Integer.parseInt(rtrn_dt[2])==Integer.parseInt(due_dt[2]))
				{
			    System.out.println((Integer.parseInt(rtrn_dt[0])-Integer.parseInt(due_dt[0]))*15);
				}
		else
				{
				System.out.println("0");
				}
		

	}

}
