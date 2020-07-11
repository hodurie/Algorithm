package D1;

import java.util.Scanner;

public class SW_2070 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int a = sc.nextInt();
			int b = sc.nextInt();


			if (a == b) {
				System.out.printf("#%d %s\n", (t + 1), "=");
			} else if (a < b) {
				System.out.printf("#%d %s\n", (t + 1), "<");
			} else {
				System.out.printf("#%d %s\n", (t + 1), ">");
			}
		}
	}
}
