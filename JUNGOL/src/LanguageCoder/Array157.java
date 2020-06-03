package LanguageCoder;
import java.util.Scanner;

public class Array157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int sum = 0;

		while (true) {
			int a = sc.nextInt();
			if (a % 5 == 0) {
				if (a != 0) {
					cnt++;
					sum += a;
				} else {
					break;
				}
			}
		}
		System.out.println("Multiples of 5 : " + cnt);
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", (double)sum/cnt);
	}
}
