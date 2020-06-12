package LanguageCoder;
import java.util.Scanner;

public class Struct195 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String[] b = new String[3];
		
		b = a.split(" ");
		
		System.out.println("name : " + b[0]);
		System.out.println("tel : " + b[1]);
		System.out.println("addr : " + b[2]);
		
	}
}
