package LanguageCoder;
import java.util.Scanner;

public class Array154 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = 0;
		for(int i = 0; i < 6; i++) {
			a += sc.nextDouble();
		}
		System.out.printf("%.1f",a/6);
	}
}
