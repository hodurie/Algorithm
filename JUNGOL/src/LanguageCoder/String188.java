package LanguageCoder;
import java.util.Scanner;

public class String188 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();

		String[] b = a.split(" ");
		
		for(int i = 0; i < b.length; i++) {
			System.out.printf("%d. %s\n",i+1, b[i]);
		}
		
	}
}
