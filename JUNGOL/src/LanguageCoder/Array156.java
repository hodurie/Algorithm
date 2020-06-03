package LanguageCoder;
import java.util.Scanner;

public class Array156 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = 1000;
		int max = -1000;

		while (true) {
			int a = sc.nextInt();
			if (a == 999) {
				System.out.println("max : " + max);
				System.out.println("min : " + min);
				break;
			} else {
				if (a < min) {
					min = a;
				}
				if (a > max) {
					max = a;
				}
			}
		}

	}
}
