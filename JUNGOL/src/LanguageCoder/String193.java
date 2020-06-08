package LanguageCoder;
import java.util.Scanner;

public class String193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] a = new String[5];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.next();
		}
		
		String[] b = new String[2];
		b[0] = sc.next();
		b[1] = sc.next();
		
		boolean tf = false;
		
		for(int i = 0; i < a.length; i++) {
			if(a[i].contains(b[0]) || a[i].contains(b[1])) {
				System.out.println(a[i]);
				tf = true;
			}
		}
		if(tf == false) {
			System.out.println("none");
		}
		
	}
}
