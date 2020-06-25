package D2;

import java.util.Scanner;

public class SW_1926 {
	static String str = "";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int n = 0;
		
		for(int i = 1; i < N+1; i++) {
			str = "";
			n = i;
			fn(n);
			n /= 10;
			fn(n);
			n /= 10;
			fn(n);
			if(str.equals("")) {
				System.out.print(i);
			}else {
				System.out.print(str);
			}
			System.out.print(" ");
		}
		
		
	}
	
	static void fn(int n) {
		if(n%10 == 3 || n%10 == 6 || n%10 == 9) {
			str += "-";
		}
	}
}
