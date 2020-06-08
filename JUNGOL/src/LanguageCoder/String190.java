package LanguageCoder;
import java.util.Scanner;

public class String190 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] a = {"flower", "rose", "lily", "daffodil", "azalea"};
		
		char b = sc.next().charAt(0);
		int cnt = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i].charAt(1) == b || a[i].charAt(2) == b) {
				System.out.println(a[i]);
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
