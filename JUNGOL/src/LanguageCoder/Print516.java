package LanguageCoder;
import java.util.Scanner;

public class Print516 {
	public static void main(String[] args) {
		double x,y;
		char z;
		
		Scanner sc = new Scanner(System.in);
		x = sc.nextDouble();
		y = sc.nextDouble();
		z = sc.next().charAt(0);
		System.out.printf("%4.2f\n%4.2f\n%c",x,y,z);
	}
}
