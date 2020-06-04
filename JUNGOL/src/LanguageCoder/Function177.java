package LanguageCoder;
import java.util.Scanner;


public class Function177 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			int a = sc.nextInt();
			sum += abs(a);
		}
		System.out.println(sum);
	}
	
	static int abs(int a) {
		return Math.abs(a);
	}
}
