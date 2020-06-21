package D1;

import java.util.Scanner;

public class SW_1933 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t = 1; t < T+1; t++) {
			if(T % t == 0) {
				System.out.print(t + " ");
			}
		}
	}
}
