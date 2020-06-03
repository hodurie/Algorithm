package LanguageCoder;
import java.util.Scanner;

public class Array165 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] a = new int[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 && j % 2 == 0) {
					a[i][j] = 1;
					System.out.print(a[i][j] + " ");
				} else if (i == 0 && j % 2 != 0) {
					a[i][j] = 0;
					System.out.print(a[i][j] + " ");
				} else {
					if (j == 0) {
						a[i][j] = a[i - 1][j + 1];
						System.out.print(a[i][j] + " ");
					} else if (j == 4) {
						a[i][j] = a[i - 1][j - 1];
						System.out.print(a[i][j] + " ");
					} else {
						a[i][j] = a[i - 1][j + 1] + a[i - 1][j - 1];
						System.out.print(a[i][j] + " ");
					}
				}
			}
			System.out.println();
		}
	}
}
