package LanguageCoder;
import java.util.Scanner;

public class Function235 {
	static int cnt = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		rec(a);
	}
	
	public static void rec(int a) {
		if(a == 1) {
			System.out.println(cnt);
			return;
		}else if(a%2 == 0) {
			cnt++;
			rec(a/2);
		}else {
			cnt++;
			rec(a/3);
			
		}
	}
}

