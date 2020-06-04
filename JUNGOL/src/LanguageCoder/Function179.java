package LanguageCoder;
import java.util.Scanner;

public class Function179 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		sumMean(a,b,c);
	}
	
	static void sumMean(double a, double b, double c) {

		System.out.println((int) Math.round((a+b+c)/3));
		a = (int) Math.round(a);
		b = (int) Math.round(b);
		c = (int) Math.round(c);
		System.out.println((int) Math.round((a+b+c)/3));
		
	}
}
