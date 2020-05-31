package LanguageCoder;
import java.util.Scanner;

public class Operator519 {
	public static void main(String[] args) {
		int a;
		int b;
		a = 0;
		b = 0;
		
		Scanner scn = new Scanner(System.in);
			
		a = scn.nextInt() + 100;
		b = scn.nextInt() % 10;
		System.out.print(a + " " + b);
	}
}
