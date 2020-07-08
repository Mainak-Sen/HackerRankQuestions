package practice;

public class Regex_username {
	
	private static void username_validator(String input) {
		final String regular_Expression = "[a-zA-Z][a-zA-Z_0-9]{7,29}" ;
		if(input.matches(regular_Expression))
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
		
	}

	public static void main(String[] args) {

		username_validator("JuliaMainakSushmitaGautamPikl1");

	}

}
