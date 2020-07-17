package D3;

import java.util.Scanner;

// 수정 필요
public class SW_10059 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			String s = sc.next();
			String A = s.substring(0, 2);
			String B = s.substring(2, 4);

			int a = Integer.parseInt(A);
			int b = Integer.parseInt(B);

			if ((a > 0 && a < 13) && (b > 0 && b < 13)) {
				System.out.printf("#%d %s\n", (t + 1), "AMBIGUOUS");
			} else if ((a > 12 && a < 32) && (b < 13 && b > 0 )) {
				System.out.printf("#%d %s\n", (t + 1), "YYMM");
			} else if ((b > 12 && b < 32) && (a < 13 && a > 0)) {
				System.out.printf("#%d %s\n", (t + 1), "MMYY");
			} else {
				System.out.printf("#%d %s\n", (t + 1), "NA");
			}
		}

	}

}
