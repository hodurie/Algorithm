package LanguageCoder;
import java.util.Scanner;

public class Function176 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		int num = sqrt(a, b);
		System.out.println(num);
	}

	static int sqrt(double a, double b) {
		a = Math.sqrt(a);
		b = Math.sqrt(b);
		double l = (a>b?a:b);
		double s = (a>b?b:a);
		
		int il = (int)l;
		int is = (int) Math.ceil(s);
		int cnt = 0;
		
		for(int i = is; i <= il; i++) {
			cnt++;
		}
		return cnt;
	}

}
