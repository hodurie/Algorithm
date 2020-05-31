package LanguageCoder;

import java.util.Scanner;

public class Control131 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int max = a;
		int min = b;
		
		if(b > a) {
			max = b;
			min = a;
		}
		
		for(int i = min; i < max+1; i++) {
			System.out.print(i + " ");
		}
	}
}
