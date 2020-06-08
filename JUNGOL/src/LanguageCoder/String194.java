package LanguageCoder;
import java.util.Scanner;

public class String194 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] a = new String[2];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.next();
		}
		System.out.println(a[0] + a[1]);
		a[0] += a[1];
		int b = sc.nextInt();
		
		String c = "";
		for(int i = 0; i < a[0].length(); i++) {
			if(b > a[1].length()) {
				if(b == c.length()) {
					break;
				}
			 	c += a[0].charAt(i);
			}else if(i < b){
				c += a[0].charAt(i);
			}else {
				if(c.length() == a[1].length()) {
					break;
				}
				c += a[1].charAt(i);
			}
		}
		
		System.out.println(c);
	}
}
