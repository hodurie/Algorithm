import java.util.Scanner;

public class Operator112 {
	public static void main(String[] args) {
		int a, b;
		a = 0;
		b = 0;
		
		Scanner scn = new Scanner(System.in);
		
		a = scn.nextInt();
		b = scn.nextInt();
		
		int c = a%b;
		int d = a/b;
		
		System.out.printf("%d / %d = %d...%d",a,b,d,c);
		
	}
}
