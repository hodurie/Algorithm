package LanguageCoder;

import java.util.Scanner;

public class Control127 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int cnt = 0;
		
		while(true) {
			int a = sc.nextInt();
			
			if((a<0) || (a>100)) {
				break;
			}
			sum += a;
			cnt += 1;
	
		}
		double avg = (double) sum/cnt;
		System.out.printf("sum : %d\navg : %.1f",sum, avg);
	}

}
