package D2;

import java.util.Scanner;

public class SW_1945 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 0; t < T; t++) {
			int N = sc.nextInt();
			int[] arr = new int[5];
			
			while(N != 1) {
				if(N % 2 == 0) {
					N /=2;
					arr[0]++;
				}
				
				if(N % 3 == 0) {
					N /= 3;
					arr[1]++;
				}
				
				if(N % 5 == 0) {
					N /= 5;
					arr[2]++;
				}
				
				if(N % 7 == 0) {
					N /= 7;
					arr[3]++;
				}
				
				if(N % 11 == 0) {
					N /= 11;
					arr[4]++;
				}
			}
			
			System.out.printf("#%d ", t+1);
			for(int i = 0; i < 5; i++)
				System.out.printf("%d ", arr[i]);
			System.out.println();
			
		}
	}
}
