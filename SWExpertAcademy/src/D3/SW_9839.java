package D3;

import java.util.Scanner;

// 수정 필요
public class SW_9839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			String mul = "";
			int max = 0;
			int cnt = 0;
			boolean check = false;

			for (int n = 0; n < N; n++) {
				arr[n] = sc.nextInt();
			}

			for (int i = 0; i < N - 1; i++) {
				for (int j = i + 1; j < N; j++) {
					mul = Integer.toString(arr[i] * arr[j]);
					for (int m = 0; m < mul.length(); m++) {
						if (mul.length() == 1) {
							check = true;
							max = Integer.parseInt(mul);
						} else {
							if (Integer.parseInt(mul, m) + 1 == Integer.parseInt(mul, m + 1)) {
								cnt++;
							} else {
								break;
							}

							if (m == (mul.length() - 1) && cnt == (mul.length() - 1)) {
								check = true;
								max = Integer.parseInt(mul);
							}
						}
					}
				}
			}

			System.out.printf("#%d %d\n", (t + 1), check == true ? max : -1);
		}

	}
}
