package LanguageCoder;
import java.util.Scanner;

public class Array151 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}

		for (int j = 0; j < 5; j += 2) {
			sum += a[j];
		}
		System.out.println(sum);
	}
}
