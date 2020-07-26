package Beginner_Coder;

import java.util.Scanner;

public class JO_1291 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int s = sc.nextInt();
		int e = sc.nextInt();

		if ((s >= 2 && s <= 9) && (e >= 2 && e <= 9)) {
			if (s <= e) {
				for (int num = 1; num <= 9; num++) {
					for (int dan = s; dan <= e; dan++) {
						System.out.print(dan + " * " + num + " = " + dan * num + "\t");
					}
					System.out.print("\n");
				}
			} else {
				for (int num = 1; num <= 9; num++) {
					for (int dan = s; dan >= e; dan--) {
						System.out.print(dan + " * " + num + " = " + dan * num + "\t");
					}
					System.out.print("\n");
				}
			}
		} else {
			System.out.println("INPUT ERROR!");
		}
		sc.close();
	}
}