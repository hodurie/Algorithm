package LanguageCoder;
import java.util.Scanner;

public class String189 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String[] b = a.split(" ");
		
		for(int i = b.length-1; i > -1; i--) {
			System.out.println(b[i]);
		}
	}
}
