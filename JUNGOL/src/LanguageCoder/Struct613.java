package LanguageCoder;

import java.util.Scanner;

public class Struct613 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] a = new String[3];
		
		for(int i = 0; i < 3; i++) {
			a[i] = sc.next();
		}
		
		System.out.println("Name : "+ a[0]);
		System.out.println("School : "+ a[1]);
		System.out.println("Grade : "+ a[2]);
	}
}
