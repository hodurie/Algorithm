package D1;

import java.util.Scanner;

public class SW_2019 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t = 0; t < T+1; t++) {
			System.out.print((int) Math.pow(2, t) + " ");
		}
	}
}
