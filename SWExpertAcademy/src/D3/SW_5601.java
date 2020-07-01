package D3;

import java.util.Scanner;

public class SW_5601 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t = 0; t < T; t++) {
			System.out.printf("#%d ", (t+1));
			int n = sc.nextInt();
			
			for(int i = 0; i < n; i++) {
				System.out.print("1/"+n+" ");
			}
			
			System.out.println();
		}
	}
}
