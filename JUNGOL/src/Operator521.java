import java.util.Scanner;

public class Operator521 {
	public static void main(String[] args) {
		int a = 0; 
		int b = 0;
		int c = 0;
		
		Scanner scn = new Scanner(System.in);
		a = scn.nextInt();
		b = scn.nextInt();
		c =(a++ * --b);
		System.out.printf("%d %d %d", a, b, c);
	}
}
