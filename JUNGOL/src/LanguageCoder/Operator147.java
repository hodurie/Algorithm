package LanguageCoder;
import java.util.Scanner;

public class Operator147 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = 1;
		
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < 2*i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < a-i; k++) {
				System.out.print(b++);
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}
