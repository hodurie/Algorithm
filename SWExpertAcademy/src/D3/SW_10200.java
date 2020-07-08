package D3;

import java.util.Scanner;

public class SW_10200 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {
			 int N = sc.nextInt();
			 int A = sc.nextInt();
			 int B = sc.nextInt();
			 
			 int max = (A > B)? B : A;
			 int min = ((A+B) > N)? ((A+B)-N) : 0;
			 
			 System.out.printf("#%d %d %d\n",(t+1), max, min);
			 
			
		}
	}
}
