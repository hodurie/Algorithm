package D2;

import java.util.Scanner;

public class SW_1974 {
	static int[][] arr = new int[9][9];
	static int check;
	static int sum;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {
			check = 1;

			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			checkRow();
			checkCol();
			checkRec();

			System.out.printf("#%d %d\n", t + 1, check);
		}

	}

	static void checkRow() {
		for (int i = 0; i < 9; i++) {
			sum = 0;
			for (int j = 0; j < 9; j++) {
				sum += arr[i][j];
			}
			if (sum != 45) {
				check = 0;
			}
		}
	}

	static void checkCol() {
		for (int i = 0; i < 9; i++) {
			sum = 0;
			for (int j = 0; j < 9; j++) {
				sum += arr[j][i];
			}
			if (sum != 45) {
				check = 0;
			}
		}
	}

	static void checkRec() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int sum = 0;
				for (int k = 0; k < 3; k++) {
					for (int l = 0; l < 3; l++) {
						sum += arr[3 * i + k][3 * j + l];
					}
				}
				if (sum != 45) {
					check = 0;
				}
			}
		}
	}

}
