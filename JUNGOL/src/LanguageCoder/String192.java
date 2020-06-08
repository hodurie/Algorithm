package LanguageCoder;
import java.util.Arrays;
import java.util.Scanner;

public class String192 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String[] b = new String[a];
		
		for(int i = 0; i < b.length; i++) {
			 b[i] = sc.next();
		}
		
		Arrays.sort(b);
		
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
