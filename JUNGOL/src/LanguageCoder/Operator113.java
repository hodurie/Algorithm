package LanguageCoder;
import java.util.Scanner;

public class Operator113 {
	public static void main(String[] args) {
		int width, length;
		width = 0;
		length = 0;
		
		Scanner scn = new Scanner(System.in);
		
		width = scn.nextInt();
		length = scn.nextInt();
		
		System.out.println("width = " + (width + 5));
		System.out.println("length = " + (length * 2));
		System.out.println("area = " + (width+5) * (length * 2));
	}
}
