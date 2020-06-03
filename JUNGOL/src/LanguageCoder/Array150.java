package LanguageCoder;
import java.util.Scanner;

public class Array150 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] str = new char[10];
		
		for(int i = 0; i<10; i++) {
			str[i] = sc.next().charAt(0);
		}
		
		for(int j= 9; j >-1; j--) {
			System.out.print(str[j]);
			System.out.print(" ");
		}
		
	}
}
