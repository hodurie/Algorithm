package LanguageCoder;
import java.util.Scanner;

public class Operator142 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i = 1;

		while (true) {
			if(a*i >= 100) {
				break;
			}
			System.out.print(a * i + " ");
			if (a * i % 10 == 0) {
				break;
			}
			i++;

		}

	}
}
