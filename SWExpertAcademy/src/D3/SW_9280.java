package D3;

import java.util.Scanner;

// 수정필요
public class SW_9280 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int sum, n, m, cnt, p;
		for(int t = 1; t <= T; t++) {
			sum = 0;
			cnt = 0;
			n = sc.nextInt();
			m = sc.nextInt();
			p = 1;
			int[] arr = new int[n + 1];
			
			int[] R = new int[n+1];
			int[] W = new int[m+1];
			R[0] = 0;
			W[0] = 0;
			arr[0] = 0;
			for(int i = 1; i <= n; i++) {
				R[i] = sc.nextInt();
				arr[i] = 0;
			}
			
			for(int i = 1; i <= m; i++) {
				W[i] = sc.nextInt();
			}
			
			// dict 형태로 저장?
			while(cnt != 2*m) {
				int temp = sc.nextInt();
				if(temp < 0) {
					p--;
				}else {
					sum += W[temp] * R[p];
					p++; 
				}
				cnt++;
			}
			
			
			System.out.printf("#%d %d\n", t, sum);
		}
	}
}
