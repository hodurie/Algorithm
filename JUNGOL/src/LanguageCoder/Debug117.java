package LanguageCoder;
import java.util.Scanner;

public class Debug117 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		System.out.printf("sum %d\navg %d", ((int)a+(int)b+(int)c),  (int)(a+b+c)/3);
	}
}
