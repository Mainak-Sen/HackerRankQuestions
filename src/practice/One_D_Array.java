package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class One_D_Array {

    public static boolean canWin(int leap, int[] game) {
  
    	return is_solvable(0,leap,game);
    }
    
    private static boolean is_solvable(int i,int leap,int[] game) {
    	//base cases
    	if(i>=game.length)
    	{
    		return true;
    	}
    	if(game.length==0||i<0||game[i]==1)
    	{
    		return false;
    	}
    	game[i]=1; //mark as visited
    	
    	return is_solvable(i+leap,leap,game)||is_solvable(i+1,leap,game)||is_solvable(i-1,leap,game);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
