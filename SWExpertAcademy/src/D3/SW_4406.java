package D3;

import java.util.Scanner;

public class SW_4406 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 0; t < T; t++) {
			String s = sc.next();
			
			s = s.replaceAll("a|e|i|o|u", "");
			
			
			System.out.printf("#%d %s\n",(t+1), s);
		}
	}
}
