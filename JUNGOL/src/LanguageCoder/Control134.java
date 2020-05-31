package LanguageCoder;

import java.util.Scanner;

public class Control134 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int odd = 0;
		int even = 0;
		for(int i = 0; i < 10; i++) {
			int a = sc.nextInt();
			if(a%2 == 0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("even : " + even);
		System.out.println("odd : " + odd);
	}
}
