package LanguageCoder;
import java.util.Scanner;

public class Operator149 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 1;

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print(b % 10);
				System.out.print(" ");
				b += 2;
			}
			System.out.println();
		}

	}
}
