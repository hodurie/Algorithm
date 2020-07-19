package D3;

import java.util.Arrays;
import java.util.Scanner;

public class SW_9839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			int[] mul = new int[N*(N-1)/2];
			int max = -1;
			int cnt = 0;
			
			for (int n = 0; n < N; n++) {
				arr[n] = sc.nextInt();
			}
			 
			for (int i = 0; i < N - 1; i++) {
				for (int j = i + 1; j < N; j++) {
					mul[cnt] = arr[i] * arr[j];
					cnt++;
				}
			}
			
			Arrays.sort(mul);
			
			for(int i = mul.length-1; i > -1; i--) {
				cnt = 0;
				String str = Integer.toString(mul[i]);
				for(int j = 0; j < str.length() -1; j++) {
					int a = Integer.parseInt(str.substring(j, j + 1));
                    int b = Integer.parseInt(str.substring(j + 1, j + 2));
                    if (a != b - 1) {
                        break;
                    }else {
                    	cnt++;
                    }
				}
				if(cnt == str.length() -1) {
					max = mul[i];
					break;
				}
			}

			System.out.printf("#%d %d\n", (t + 1), max);
		}
	}
}
