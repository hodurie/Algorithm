package LanguageCoder;
import java.util.Scanner;

public class Array152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int odd = 0;
		int even = 0;
		for(int i = 0; i < 10; i++) {
			int a = sc.nextInt();
			
			if(i%2 == 0) {
				odd += a;
			}else {
				even += a;
			}
		}
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
	}
}
