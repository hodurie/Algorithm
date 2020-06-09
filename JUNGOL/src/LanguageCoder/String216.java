package LanguageCoder;
import java.util.Scanner;

public class String216 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";

		while (true) {
			str = sc.next();
			if (str.equals("END")) {
				break;
			}
			for (int i = str.length() - 1; i > -1; i--) {
				System.out.print(str.charAt(i));
			}
			System.out.println();
		}
	}
}
