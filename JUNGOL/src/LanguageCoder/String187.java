package LanguageCoder;
import java.util.Scanner;

public class String187 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int b = 0;
		
		while(a.length() > 1) {
			b = sc.nextInt();
			if(b > a.length()) {
				String c = "";
				for(int i = 0; i < a.length() - 1; i++) {
					c += a.charAt(i);					
					}
				a = c;
				System.out.println(a);
			}else {
				String c = "";
				for(int i = 0; i < a.length(); i++) {
					if(i != b-1) {
						c += a.charAt(i);
					}
				}
				a = c;
				System.out.println(a);
			}
		}
				
	}
}
