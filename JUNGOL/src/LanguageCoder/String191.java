package LanguageCoder;
import java.util.Scanner;

public class String191 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] a = new String[50];

		int j = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.next();
			if (a[i].equals("0")) {
				break;
			}
			j++;
		}
		System.out.println(j);
		for (int i = 0; i < j; i++) {
			if (i % 2 == 0) {
				System.out.println(a[i]);
			}
		}
	}
}
