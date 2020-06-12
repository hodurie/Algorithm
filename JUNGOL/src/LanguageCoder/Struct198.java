package LanguageCoder;
import java.util.Scanner;

public class Struct198 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] a = new double[4];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextDouble();
		}
		
		System.out.printf("height : %dcm\n", (int)((a[0] + a[2])/2 + 5));
		System.out.printf("weight : %.1fkg", (double)((a[1] + a[3])/2 - 4.5));
	}
}
