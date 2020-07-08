package practice;

public class Smallest_and_biggest_palindrome {
	
	private static boolean is_palindrome(String a) {
		
		String str="";
		for(int i=a.length()-1;i>=0;i--)
		{
			str=str+a.charAt(i);
		}
		
		if(a.equalsIgnoreCase(str))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
private static void  maxmin_palindrome(String input) {
	
	String[] input_array_words=input.split(" ");
	int max=0;
	int min=0;
	String tempmax="";
	String tempmin=input_array_words[0];
	
	for(String s:input_array_words)
	{
		if(is_palindrome(s)) {
			if(s.length()>max)
			{
				max=s.length();
				tempmax=s;
			}
			if(s.length()<min)
			{
				min=s.length();
				tempmin=s;	
			}
		}
	}
	
	System.out.println("The maximum possible palindrome is :"+tempmax);
	System.out.println("The minimum possible palindrome is :"+tempmin);	
	}
	
	

	public static void main(String[] args) {
		
		maxmin_palindrome("Wow you own kayak");
			

	}

}
