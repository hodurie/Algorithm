package LanguageCoder;
import java.util.Scanner;

public class Array168 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[][] arr = new int[a][a];

		arr[0][0] = 1;
		for (int i = 1; i < a; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0) {
					arr[i][j] = arr[i - 1][j];
				} else {
					arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
				}
			}
		}
		
		for(int i = a-1; i > -1; i--) {
			for(int j = a-1; j > -1; j--) {
				if(arr[i][j] != 0) {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
};
