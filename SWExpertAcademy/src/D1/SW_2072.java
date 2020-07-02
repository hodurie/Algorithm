package D1;

import java.util.Scanner;

public class SW_2072 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int sum = 0;
			for (int i = 0; i < 10; i++) {
				int n = sc.nextInt();
				if (n % 2 == 1) {
					sum += n;
				}

			}
			System.out.println("#" + (t + 1) + " " + sum);

		}
	}
}
