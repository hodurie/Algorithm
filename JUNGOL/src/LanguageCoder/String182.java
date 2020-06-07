package LanguageCoder;
import java.util.Scanner;

public class String182 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		char b = sc.next().charAt(0);
		System.out.print((a+b) + " ");
		if(a > b) {
			System.out.println(a-b);
		}else {
			System.out.println(b-a);
		}
	}
}
