package D3;

import java.util.Scanner;

public class SW_9778 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t = 0; t < T; t++) {
			int[] arr =  {0, 0, 4, 4, 4, 4, 4, 4, 4, 4, 16, 4};
			int N = sc.nextInt();
			int n = 52-N;
			int num = 0;
			int sum = 21;
			
			for(int i = 0; i < N; i++) {
				num = sc.nextInt();
				sum -= num;
				arr[num]--;
			}
			
			String result = "GAZUA";
			
			if(sum < 12) {
				int cnt = 0;
				for(int i = 2; i < sum + 1; i++) {
					cnt += arr[i];
				}
				
				if((n-cnt) >= cnt) {
					result = "STOP";
				}
			}
			
			System.out.printf("#%d %s\n", (t+1), result);
				
		}
		
		
	}
}

