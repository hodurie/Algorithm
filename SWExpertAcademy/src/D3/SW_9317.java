package D3;

import java.util.Scanner;

public class SW_9317 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int t = 0; t < T; t++) {
			int n = sc.nextInt();
			int c = 0;
			String str = sc.next();
			String str2 = sc.next();
			
			for(int i = 0; i < n; i++) {
				if(str.charAt(i) == str2.charAt(i)) {
					c++;
				}
			}
			
			System.out.printf("#%d %d\n", (t+1), c);
			
			
		}
	}
}
