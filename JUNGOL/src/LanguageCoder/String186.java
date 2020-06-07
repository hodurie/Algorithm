package LanguageCoder;
import java.util.Scanner;

public class String186 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		int c = a.length();
		int d = b.length();
		System.out.println(c>d?c:d);
	}
}
