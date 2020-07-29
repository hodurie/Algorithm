package D3;

import java.util.Arrays;
import java.util.Scanner;

public class SW_8658 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 1; t <= T; t++) {
			int[] arr = new int[10];
			int temp = 0;
			for(int i = 0; i < 10; i++) {
				temp = sc.nextInt();
				arr[i] = 0;
				while(temp != 0) {
					arr[i] += temp%10;
					temp /= 10;
				}
			}
			Arrays.sort(arr);			
			System.out.printf("#%d %d %d\n", t, arr[9], arr[0]);
		}
	}
}
