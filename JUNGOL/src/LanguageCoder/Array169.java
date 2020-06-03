package LanguageCoder;
import java.util.Scanner;

public class Array169 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] a = new char[3][5];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				a[i][j] = sc.next().charAt(0);
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				a[i][j] = (char) (a[i][j] + 32);
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}
}
