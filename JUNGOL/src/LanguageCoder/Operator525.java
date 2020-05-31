package LanguageCoder;
import java.util.Scanner;

public class Operator525 {
	public static void main(String[] args) {
		int a,b,c;
		
		a = 0;
		b = 0;
		c = 0;
		
		Scanner scn = new Scanner(System.in);
		a = scn.nextInt();
		b = scn.nextInt();
		c = scn.nextInt();
		
		boolean d = (a > b) && (a > c);
		boolean e = (a == b) && (b== c);
		
		
		
		System.out.println(d + " " + e);
	}
}
