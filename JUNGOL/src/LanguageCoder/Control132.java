package LanguageCoder;

import java.util.Scanner;

public class Control132 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int sum = 0;
		for(int i = 1; i < a; i++) {
			if(i*5 <= a) {
				sum = sum + i*5;
			}
		}
		System.out.println(sum);
	}
}
