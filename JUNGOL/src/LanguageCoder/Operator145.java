package LanguageCoder;
import java.util.Scanner;

public class Operator145 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=1; i<a+1; i++) {
			for(int j=0; j<2*(a-i); j++) {
				System.out.print(" ");
			}
			for(int k=0; k < i; k++) {
				System.out.print(k+1);
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
