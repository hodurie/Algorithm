package D2;

import java.util.Scanner;

public class SW_1989 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {

			String str = sc.next();
			int cnt = 0;

			for (int i = str.length()-1; i > -1; i--) {
				if (str.charAt(i) == str.charAt(cnt)) {
					cnt++;
				}
			}

			if (cnt == str.length()) {
				System.out.printf("#%d %d\n", t + 1, 1);

			} else {
				System.out.printf("#%d %d\n", t + 1, 0);
			}

		}
	}
}
