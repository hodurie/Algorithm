package D3;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SW_10505 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			for(int n = 0; n < N; n++) {
				arr[n] = sc.nextInt();
			}
			int sum = IntStream.of(arr).sum();
			double mean = (double)(sum/N);
			int cnt = 0;
			
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] <= mean) {
					cnt++;
				}
			}
			System.out.printf("#%d %d\n", t, cnt);
			
		}
	}
}
