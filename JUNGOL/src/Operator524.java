import java.util.Scanner;

public class Operator524 {
	public static void main(String[] args) {
		int a,b;
		a = 0;
		b = 0;
		
		Scanner scn = new Scanner(System.in);
		
		a = scn.nextInt();
		b = scn.nextInt();
		
		boolean c = (a!=0);
		boolean d = (b!=0);

		
		System.out.print((c&&d) +" "+ (c||d));
		
	}
}
