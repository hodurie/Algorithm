package LanguageCoder;
import java.util.Scanner;

public class Print515 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.printf("%d * %d = %d\n",x,y,(x*y));
		System.out.printf("%d / %d = %d",x,y,(x/y));
	}
}
