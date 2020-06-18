package D2;

import java.util.Scanner;

// 오류 나는 이유 확인하기.
public class SW_1946 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int n = 0;
		int num = 0;
		String str = "";
		int cnt = 0;

		for (int t = 0; t < T; t++) {
			n = sc.nextInt();

			System.out.println("#" + (t + 1));

			while (true) {
				if (n == 0) {
					break;
				}
				str = sc.next();
				num = sc.nextInt();

				for (int i = 0; i < num; i++) {
					System.out.print(str);
					if (cnt % 10 == 9)
						System.out.println();
					cnt++;
				}

				n--;
			}
			System.out.print(" ");
			System.out.println();

		}
	}

}
