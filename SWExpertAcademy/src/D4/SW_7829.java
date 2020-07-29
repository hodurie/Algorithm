package D4;

import java.util.Scanner;

public class SW_7829 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			int[] arr = new int[N];
			
			for(int n = 0; n < N; n++) {
				arr[n] = sc.nextInt();
				if(arr[n] > max) {
					max = arr[n];
				}
				if(arr[n] < min) {
					min = arr[n];
				}
			}
			
			System.out.printf("#%d %d\n", t, min*max);
		}
	}
}
