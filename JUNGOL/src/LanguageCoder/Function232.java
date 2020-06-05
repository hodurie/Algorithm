package LanguageCoder;
eimport java.util.Scanner;

public class Function232 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		rec(a);
	}
	
	static void rec(int a) {
		if(a%2 == 0) {
			if(a == 2) {
				System.out.print(2 + " ");
				return;
			}
			rec(a-2);
			System.out.print(a + " ");
		}
		
		if(a%2 == 1) {
			if(a == 1) {
				System.out.print(1 + " ");
				return;
			}
			rec(a-2);
			System.out.print(a + " ");
		}
		
	}
}
