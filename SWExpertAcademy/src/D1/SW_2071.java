package D1;

import java.util.Scanner;

public class SW_2071 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t = 0; t < T; t++) {
			double sum = 0;
			
			for(int i = 0; i < 10; i++) {
				sum += sc.nextInt();
			}
			
			System.out.printf("#%d %d\n",(t+1),Math.round(sum/10));
		}
	}
}
