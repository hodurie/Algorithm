package D3;

import java.util.Scanner;

public class SW_9700 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		double p = 0;
		double q = 0;
		
		for(int t = 0; t < T; t++) {
			p = sc.nextDouble();
			q = sc.nextDouble();
			
			System.out.printf("#%d %s\n",(t+1), ((1-p)*(q) < p*(1-q)*q ? "YES":"NO"));
		}
	}
}
