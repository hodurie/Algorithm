package D3;

import java.util.Scanner;

public class SW_9997 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t = 0; t < T; t++) {
			int rad = sc.nextInt();
			rad *= 2;
			System.out.printf("#%d %d %d\n",(t+1),(rad/60),(rad%60));
		}
	}
}
