package LanguageCoder;

import java.util.Scanner;

public class Control138 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i = 1; i < a+1; i++) {
			for(int j = 1; j < a+1; j++) {
				System.out.print("(" + i + ", " + j + ") ");
			}
			System.out.println();
		}
	}
}
