package LanguageCoder;
import java.util.Scanner;

public class String237 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		double b = sc.nextDouble();
		b = Math.round(b * 1000) / 1000.0;
		
		String c = sc.next();

		String txtAll = a + b + c;

		int N = txtAll.length();
		for (int i = 0; i < N; i++) {
			if (N % 2 == 0) {
				if (i == N / 2) {
					System.out.println();
				}
				System.out.print(txtAll.charAt(i));
			} else {
				if (i == (N+1)/2) {
					System.out.println();
				}
				System.out.print(txtAll.charAt(i));
			}
		}

	}
}
