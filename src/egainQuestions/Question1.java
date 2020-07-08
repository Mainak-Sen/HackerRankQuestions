package egainQuestions;

import java.util.Scanner;
import java.util.regex.Pattern;

public  class Question1 {
	
	private static int calculate_pure_words(String input) {
		
	    String replaced_nonletter=input.replaceAll("[^a-zA-Z]+"," ");
	    String[] split_string=replaced_nonletter.split("\\s+");
	    int pure_word_count=split_string.length;
	    return pure_word_count;
	    
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        
        System.out.println(calculate_pure_words(input));

	}

}
