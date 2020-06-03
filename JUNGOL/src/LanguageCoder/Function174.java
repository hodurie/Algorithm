package LanguageCoder;
import java.util.Scanner;

public class Function174 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][3];
		int[] sum = new int[3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = sc.nextInt();
			}
			display(a[i]);
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum[i] += a[j][i];
			}
		}
		display(sum);
		
	}

	static void display(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print(a[0] + a[1] + a[2] + "\n");
	}

}
