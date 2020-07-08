package practice;

import java.util.Scanner;

public class bitwise_operations {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int max = Integer.MIN_VALUE;
            int n = in.nextInt();
            int k = in.nextInt();
            for (int a = 1; a <= n-1; a++) {
                for (int b = a+1; b <= n; b++) {
                    int val = a&b;
                    if (val > max && val < k) 
                        max = val;                    
                }    
            }
            System.out.println(max);
        }
        in.close();

	}

}
