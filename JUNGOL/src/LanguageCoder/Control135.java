package LanguageCoder;

import java.util.Scanner;

public class Control135 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max = a;
		int min = b;
		
		if(b > a) {
			max = b; min = a;
		}
		
		int sum = 0;
		int cnt = 0;
		
		for(int i = min; i < max+1; i++) {
			if(i%3 == 0 || i%5 == 0) {
				sum += i;
				cnt++;
			}
		}
		
		double avg = (double) sum/cnt;
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", avg);
	}

}
