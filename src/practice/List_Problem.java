package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class List_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int initial=in.nextInt();
		List<Integer> int_list=new ArrayList<Integer>(initial);
		for(int i=0;i<initial;i++)
		{
			int_list.add(in.nextInt());
		}
		int number_of_queries=in.nextInt();
		for(int j=0;j<number_of_queries;j++)
		{
			String operation =in.next();
			if(operation.equalsIgnoreCase("Insert"))
			{
				int x=in.nextInt();
				int y=in.nextInt();
				int_list.add(x,y);
				in.nextLine();
			}
			else
			{
				int x=in.nextInt();
				int_list.remove(x);
				in.nextLine();
			}
		}
		in.close();
		for(int k=0;k<int_list.size();k++)
		{
			System.out.print(int_list.get(k)+" ");
		}
		
	}

}
