package LanguageCoder;

import java.util.Scanner;

public class Control137 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		for(int i = 1; i < row + 1; i++) {
			for(int j = 1; j < col + 1; j++) {
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
	}
}
