package LanguageCoder;
import java.util.Scanner;

public class Function171 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		display(a);
		
	}
	
	public static void display(int a) {
		int result = 0;
		for(int i = 1; i < a+1; i++) {
			result += i;
		}
		System.out.println(result);
	}
}
