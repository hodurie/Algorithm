package LanguageCoder;

import java.util.Scanner;

public class Control139 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a > b) {
			for (int i = 1; i < 10; i++) {
				for (int j = a; j > b - 1; j--) {

					System.out.printf("%d * %d = %2d   ", j, i, (j * i));
				}
				System.out.println();
			}
		} else {
			for (int i = 1; i < 10; i++) {
				for (int j = a; j < b+1; j++) {
					System.out.printf("%d * %d = %2d   ", j, i, (j * i));
				}
				System.out.println();
			}

		}
	}
}
