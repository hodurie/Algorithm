package LanguageCoder;

import java.util.Scanner;

public class Control126 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int odd = 0;
		int even = 0;
		while(true) {
			int a = sc.nextInt();
			
			if(a == 0) {
				break;
			}else if(a % 2 == 0) {
				even++;				
			}else {
				odd++;
			}
		}
		
		System.out.printf("%s : %d\n%s : %d","odd",odd,"even",even);
	}
}
