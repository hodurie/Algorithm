import java.util.Scanner;

public class Operator518 {
	public static void main(String[] args) {
		int a, b, c;
		a = 0; b = 0; c = 0;
		Scanner scn = new Scanner(System.in);
		a = scn.nextInt();
		b = scn.nextInt();
		c = scn.nextInt();
		
		System.out.println("sum : " + (a + b+ c));
		System.out.println("avg : " + (a + b+ c)/3);
	}
}
