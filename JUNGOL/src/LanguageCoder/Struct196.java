package LanguageCoder;
import java.util.Arrays;
import java.util.Scanner;

public class Struct196 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] a = new String[3];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextLine();
		}
		
		Arrays.sort(a);
		
		String[] b = a[0].split(" ");
		
		System.out.println("name : " + b[0]);
		System.out.println("tel : " + b[1]);
		System.out.println("addr : " + b[2]);		
	}

}
