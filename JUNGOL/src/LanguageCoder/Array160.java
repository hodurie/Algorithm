package LanguageCoder;
import java.util.Scanner;

public class Array160 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] iarr = new int[7];
		
		for(int i = 0; i < 10; i++) {
			int a = sc.nextInt();
			iarr[a]++;
		}
		
		for(int i = 1; i < iarr.length; i++) {
			System.out.printf("%d : %d\n",i,iarr[i]);
		}
	}
}
