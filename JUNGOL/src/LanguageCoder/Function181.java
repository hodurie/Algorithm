package LanguageCoder;
import java.util.Scanner;

public class Function181 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("radius : ");
		double a = sc.nextDouble();
		
		circle(a);
	}
	
	static void circle(double a) {
		double pi = 3.141592;
		System.out.printf("area = %.3f",a*a*pi);
	}
	
}
