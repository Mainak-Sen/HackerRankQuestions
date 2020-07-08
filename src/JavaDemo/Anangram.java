package JavaDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class Anangram {
	
	static boolean isAnagram(String a, String b) {
		int c[] = new int[26];
		int d[] = new int[26];
		if(a.length()!=b.length())
		{
			return false;
		}
		else
		{
			for(int i=0;i<a.length();i++)
			{
				c[a.toUpperCase().charAt(i)-'A']++;
				d[b.toUpperCase().charAt(i)-'A']++;
			}
			for(int j=0;j<26;j++)
			{
				if(c[j]!=d[j]) return false;
			}
			return true;
		}
		
		
		/*if(a.length() != b.length()) return false;
        int c[] = new int[26], d[] = new int[26] ;
        a = a.toUpperCase();
        b = b.toUpperCase();
        for(int i=0; i<a.length(); i++){
            c[a.charAt(i) - 'A']++;
            d[b.charAt(i) - 'A']++;
        }
        for(int i =0;i<26; i++)
            if(c[i] != d[i] ) return false;
        return true;*/

        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}

}
