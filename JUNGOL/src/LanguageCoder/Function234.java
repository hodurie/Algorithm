package LanguageCoder;
import java.util.Scanner;

public class Function234 {
	static int[] iarr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		iarr = new int[N];
		
		rec(0, N);
	}
	
	public static void rec(int a, int b) {
		if (a == b) {
			System.out.print(iarr[a-1] + " ");
			return;
		}
		if(a == 0) {
			iarr[a] = 1;
			a++;
			rec(a, b);
		}else if(a == 1) {
			iarr[a] = 2;
			a++;
			rec(a, b);
		}else {
			iarr[a] = (iarr[a-2] * iarr[a-1]) % 100;
			a++;
			rec(a, b);
		}
	}
}
