package D3;

import java.util.Scanner;

public class SW_9940 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int t = 0; t < T; t++) {
			int N = sc.nextInt();
			int[] arr = new int[N+1];
			String check = "Yes";
			
			for(int i = 0; i < N; i++) {
				int n = sc.nextInt();
				arr[n]++;
				if(arr[n] >= 2) {
					check = "No";
				}
			}
			
			System.out.println("#"+(t+1)+" "+check);
		}
	}
}
