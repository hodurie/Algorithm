package D1;

import java.util.Scanner;

public class SW_1936 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a > b) {
			if(a == 3 && b == 1) {
				System.out.println("B");
			}else {
				System.out.println("A");
			}
		}else {
			if(b == 3 && a == 1) {
				System.out.println("A");
			}else {
				System.out.println("B");
			}
		}
	}
}
