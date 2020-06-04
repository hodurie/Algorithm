package LanguageCoder;
import java.util.Scanner;

public class Function178 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		System.out.println((int)pow(a));
	}
	
	static int pow(double a) {
		return (int) Math.pow(2.0, a);
	}
}
