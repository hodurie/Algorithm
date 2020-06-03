package LanguageCoder;
import java.util.Scanner;

public class Array164 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[4];
		
		System.out.print("1class? ");
		for(int i = 0; i < 3; i++) {
			a[0] += sc.nextInt();
		}
		System.out.print("2class? ");
		for(int i = 0; i < 3; i++) {
			a[1] += sc.nextInt();
		}
		System.out.print("3class? ");
		for(int i = 0; i < 3; i++) {
			a[2] += sc.nextInt();
		}
		System.out.print("4class? ");
		for(int i = 0; i < 3; i++) {
			a[3] += sc.nextInt();
		}
		for(int i = 0; i < 4; i++) {
			System.out.printf("%dclass : %d\n",i+1, a[i]);
		}

	}
}
