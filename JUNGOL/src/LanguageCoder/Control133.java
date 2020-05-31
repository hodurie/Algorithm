package LanguageCoder;

import java.util.Scanner;

public class Control133 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		double sum = 0;
		for(int i = 0; i < a; i++) {
			sum = sum + sc.nextInt();
		}
		double avg = sum/a;
		System.out.printf("%.2f",avg);
	}
}
