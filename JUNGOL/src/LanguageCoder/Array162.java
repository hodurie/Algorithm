package LanguageCoder;
import java.util.Scanner;

public class Array162 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] iarr = new int[10];
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i = 0; i < iarr.length; i++) {
			if(i == 0) {
				iarr[i] = a;
				System.out.print(iarr[i] + " ");
			}else if(i == 1) {
				iarr[i] = b;
				System.out.print(iarr[i] + " ");
			}else {
			iarr[i] = (iarr[i-2] + iarr[i-1])%10;
			System.out.print(iarr[i] + " ");
			}
		}
	}
}
