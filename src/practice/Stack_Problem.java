package practice;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Problem {
	
	private static boolean is_balanced(String input) {
		
		 Stack<Character> stacky=new Stack<Character>();
         for(int i=0;i<input.length();i++)
         {
         	if(input.charAt(i)=='{')
         	{
         		stacky.push(input.charAt(i));
         	}
         	else if(input.charAt(i)=='(')
         	{
         		stacky.push(input.charAt(i));
         	}
         	else if(input.charAt(i)=='[')
         	{
         		stacky.push(input.charAt(i));
         	}
         	else if(input.charAt(i)=='}')
         	{
         		if(stacky.isEmpty()) {return false;}
         		else if(stacky.peek()!= '{') {return false;}
         		else {stacky.pop();}
         	}
         	else if(input.charAt(i)==')')
         	{
         		if(stacky.isEmpty()) {return false;}
         		else if(stacky.peek()!='(') {return false;}
         		else {stacky.pop();}
         	}
         	else if(input.charAt(i)==']')
         	{
         		if(stacky.isEmpty()) {return false;}
         		else if(stacky.peek()!='[') {return false;}
         		else {stacky.pop();}
         	}
         }
         
         return stacky.isEmpty();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
			System.out.println(is_balanced(input));
            
		}

	}

}
