package D2;

import java.util.Scanner;

public class SW_1954 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			
			int x = 0;
			int y = -1;
			int cnt = 1;
			int t = 1;
			
			while(true) {
				for(int j = 0; j < N; j++) {
					y = y + t;
					arr[x][y] = cnt;
					cnt++;
				}
				N--;
				
				for(int j = 0; j < N; j++) {
					x = x + t;
					arr[x][y] = cnt;
					cnt++;
				}
				t *= -1;
				
				if(N == 0)
					break;
			}
			System.out.printf("#%d\n", i+1);
			
			for(int j = 0; j < arr.length; j++) {
				for(int k = 0; k < arr.length; k++) {
					System.out.print(arr[j][k] + " ");
				}
				System.out.println();
			}
		}
	}
}
