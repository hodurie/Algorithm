package D3;

import java.util.Scanner;

public class SW_10032 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			System.out.printf("#%d %d\n", t, (N%K) == 0 ? 0 : 1);
		}
	}
}