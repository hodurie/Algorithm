package LanguageCoder;

import java.util.Scanner;

public class Control129 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Base = ");
			int a = sc.nextInt();
			System.out.print("Height = ");
			int b = sc.nextInt();
			System.out.printf("Triangle width = %.1f", (double)a*b/2);
			System.out.print("\nContinue? ");
			String d = sc.next();
			if (!(d.equals("Y") || d.equals("y"))) {
				break;
			}
		}
			
		
	}

}
