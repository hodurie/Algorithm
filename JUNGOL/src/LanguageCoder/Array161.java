package LanguageCoder;
import java.util.Scanner;

public class Array161 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] iarr = new int[11];

		for (int i = 0; i < 101; i++) {
			int a = sc.nextInt();
			if (a != 0) {
				iarr[(a/10)]++;	
			}else {
				break;
			}
		}

		for (int i = iarr.length-1; i > -1; i--) {
			if (iarr[i] != 0) {
				System.out.printf("%d : %d person\n", i*10, iarr[i]);
			}
		}
	}
}
