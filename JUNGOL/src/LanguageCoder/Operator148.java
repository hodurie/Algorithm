package LanguageCoder;
import java.util.Scanner;

public class Operator148 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i = 1; i < a+1; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("#");
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i = 1; i < a; i++) {
			for(int j = 0; j < 2*i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < a-i; k++) {
				System.out.print("#");
				System.out.print(" ");
			}
			System.out.println();
			
		}
	}
}
