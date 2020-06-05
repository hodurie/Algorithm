package LanguageCoder;
import java.util.Scanner;

public class Function233 {
	static int N;
	static int M;
	static int[] iarr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		iarr = new int[N];
		rec(0, 0);
	}

	public static void rec(int a, int b) {
		if (a < iarr.length) {
			for (int i = 0; i < 6; i++) {
				iarr[a] = i + 1;
				rec(a + 1, b + i + 1);
			}
		} else {
			if (b == M) {
				for (int i = 0; i < iarr.length; i++) {
					System.out.print(iarr[i] + " ");
				}
				System.out.println();

			}
		}
	}
}
