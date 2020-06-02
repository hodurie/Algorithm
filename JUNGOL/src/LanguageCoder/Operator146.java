package LanguageCoder;
import java.util.Scanner;

public class Operator146 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 65;
		int c = 0;
		int b = sc.nextInt();
		
		for(int i=0; i<b; i++) {
			for(int j = 0; j < b-i; j++) {
				System.out.print((char)(a++));
				System.out.print(" ");
			}
			for(int k = 0; k < i; k++) {
				System.out.print(c++);
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}
