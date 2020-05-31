package LanguageCoder;
import java.util.Scanner;

public class Operator114 {
	public static void main(String[] args) {
		int a, b;
		a = 0;
		b = 0;
		
		Scanner scn = new Scanner(System.in);
		a = scn.nextInt();
		b = scn.nextInt();
		
		System.out.println(++a +" "+ b--);
		System.out.println(a +" "+  b);
	}
}
