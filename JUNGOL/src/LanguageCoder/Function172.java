package LanguageCoder;
import java.util.Scanner;

public class Function172 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		display(a);
		
	}
	public static void display(int a) {
		int b;
		for(int i = 1; i < a+1; i++) {
			b = 1;
			for(int j = 1; j < a+1; j++) {
				System.out.print(b*i + " ");
				b++;
			}
			System.out.println();
		}
	}
}
