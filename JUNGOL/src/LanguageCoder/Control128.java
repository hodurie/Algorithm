package LanguageCoder;

import java.util.Scanner;

public class Control128 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		while(true) {
			int a = sc.nextInt();
			if(a == 0) {
				break;
			}
			cnt++;
			if(a % 3 == 0 || a % 5 == 0) {
				cnt--;
			}
		}
		System.out.println(cnt);
	}
}
