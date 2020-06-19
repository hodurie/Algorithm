package D2;

import java.util.Scanner;

public class SW_1948 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for(int t = 0; t < T; t++) {
			int[] a = new int[4];
			int day = 0;
			for(int i = 0; i < 4; i++) {
				a[i] = sc.nextInt();
			}
			
			if(a[0] == a[2])
				day += a[3] - (a[1] - 1);
			else {
				day += m[a[0]] - a[1];
				for(int i = a[0] + 1; i < a[2]; i++) {
					day += m[i];
				}
				day += (a[3] + 1);
			}
			System.out.printf("#%d %d\n", t+1, day);
		}
	}
}