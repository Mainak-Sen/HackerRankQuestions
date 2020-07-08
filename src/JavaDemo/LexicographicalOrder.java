package JavaDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class LexicographicalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan =new Scanner(System.in);
			String input = scan.next();
			int k =scan.nextInt();
			ArrayList<String> b =new ArrayList<String>();
			for (int i=0;i<=(input.length()-k);i++)
			{
				String substr = input.substring(i,i+k);
				b.add(substr);
			}
			
			System.out.println(b);
			String smallest =b.get(0);
	        String largest ="";
			for (int j=0;j<b.size();j++)
			{
				if(b.get(j).compareTo(smallest)<0)
				{
					smallest=b.get(j);
				}
				if(b.get(j).compareTo(largest)>0)
				{
					largest=b.get(j);
				}
			}
			
			System.out.println(smallest);
			System.out.println(largest);
	}

}
