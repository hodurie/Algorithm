package LanguageCoder;
import java.util.Scanner;

public class Array167 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[4][2];
		
		for(int i = 0; i < 4; i++) {
			int sum = 0;
			for(int j = 0; j < 2; j++) {
				a[i][j] = sc.nextInt();
				sum += a[i][j];
			}
			System.out.print(sum/2 + " ");
		}
		System.out.println();
		
		for(int i = 0; i < 2; i++) {
			System.out.print((a[0][i]+a[1][i]+a[2][i]+a[3][i])/4+ " ");
		}
		System.out.println();
		
		int allsum = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 2; j++) {
				allsum += a[i][j];
			}
		}
		System.out.println(allsum/8);
	}
}
