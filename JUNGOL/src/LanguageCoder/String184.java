package LanguageCoder;
import java.util.Scanner;

public class String184 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		a = a.toLowerCase();
		a = a.replaceAll("[^(a-z||0-9)]", "");	
		
		System.out.println(a);
	}
}
