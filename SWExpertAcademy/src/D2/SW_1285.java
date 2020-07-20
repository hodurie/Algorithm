package D2;

import java.util.Arrays;
import java.util.Scanner;

public class SW_1285 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t = 0; t < T; t++) {
			int cnt = 0;
			int n = sc.nextInt();
			int[] arr = new int[n];
			
			for(int i = 0; i < n; i++) {
				arr[i] = Math.abs(sc.nextInt());
			}
			
			Arrays.sort(arr);
			
			for(int i = 0; i < arr.length; i++) {
				if(arr[0] == arr[i]) {
					cnt++;
				}
			}
			
			System.out.printf
			("#%d %d %d\n", (t+1), arr[0], cnt);
		}
	}
}
