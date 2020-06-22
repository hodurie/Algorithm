package D2;

import java.util.Scanner;

public class SW_1946 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int t = 0; t < T; t++) {
			int size = sc.nextInt();
			String[] letter = new String[size];
			int[] num = new int[size];
			
			for (int i = 0; i < size; i++) {
				letter[i] = sc.next();
				num[i] = sc.nextInt();
			}
			
			int count = 0;
			System.out.println("#" + t+1);
			
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < num[i]; j++) {
					System.out.print(letter[i]);
					count++;
					
					if (count == 10) {
						System.out.println();
						count = 0;
					}
				}
			}
			System.out.println();
		}
	}
}
