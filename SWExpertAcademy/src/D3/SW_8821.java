package D3;

import java.util.Arrays;
import java.util.Scanner;

public class SW_8821 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 1; t <= T; t++) {
			int[] arr = new int[10];
			
			for(int i = 0; i < 10; i++) {
				arr[i] = 0;
			}
			
			int cnt = 0;
			String str = sc.next();
			
			for(int i = 0; i < str.length(); i++) {
				int temp = str.charAt(i) - '0';
				if(arr[temp] == 0) {
					arr[temp]++;
					cnt++;
				}else {
					arr[temp]--;
					cnt--;
				}
			}
			System.out.printf("#%d %d\n", t, cnt);
		}
	}
}
