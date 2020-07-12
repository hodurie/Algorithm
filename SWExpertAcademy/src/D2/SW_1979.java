package D2;

import java.util.Scanner;

public class SW_1979 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			int sum = 0;
			int temp = 0;
			int k = sc.nextInt();
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < N; i++) {
				temp = 0;
				for (int j = 0; j < N; j++) {
					if(arr[i][j] == 1) {
						temp++;
					}else {
						temp = 0;
					}
					
					if(temp == k) {
						sum++;
					}
					
					if(temp == k+1) {
						sum--;
					}
					

				}
			}
			
			
			for (int i = 0; i < N; i++) {
				temp = 0;
				for (int j = 0; j < N; j++) {
					if(arr[j][i] == 1) {
						temp++;
					}else {
						temp = 0;
					}
					
					if(temp == k) {
						sum++;
					}
					
					if(temp == k+1) {
						sum--;
					}
					
				}
			}
			
			System.out.printf("#%d %d\n", (t+1), sum);

		}
	}

}
