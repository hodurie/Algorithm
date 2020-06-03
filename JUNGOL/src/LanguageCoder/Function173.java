package LanguageCoder;
import java.util.Scanner;

public class Function173 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		display(a, b);
	}
	
	static void display(int a, int b) {
		if(a>b) {
			System.out.println((int)(Math.pow(a, 2) - Math.pow(b, 2)));
		}else {
			System.out.println((int)(Math.pow(b, 2) - Math.pow(a, 2)));
		}
	}

}
