package LanguageCoder;
import java.util.Scanner;

public class Control120 {
	public static void main(String[] args) {
		int a, b;
		a = 0; b = 0;
		Scanner scn = new Scanner(System.in);
		
		a = scn.nextInt();
		b = scn.nextInt();
	
		if(a>b) {
			System.out.println(a-b);
		}else {
			System.out.println(b-a);
		}
	}
}
