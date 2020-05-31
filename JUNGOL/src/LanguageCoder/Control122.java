package LanguageCoder;
import java.util.Scanner;

public class Control122{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		
		if((a%400 == 0)||(a%4 == 0 && a%100 != 0)) {
			System.out.println("leap year");
		}else {
			System.out.println("common year");
		}
	}
}
