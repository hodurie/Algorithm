import java.util.Scanner;

public class Operator523 {
	public static void main(String[] args) {
		int a, b;
		a = 0;
		b = 0;
		Scanner scn = new Scanner(System.in);
		a = scn.nextInt();
		b = scn.nextInt();
		
		if(a > b) {
			System.out.printf("%d > %d --- %s\n",a, b, true);
		}else {

			System.out.printf("%d > %d --- %s\n",a, b, false);
		}
		
		if(a < b) {
			System.out.printf("%d < %d --- %s\n",a, b, true);
		}else {

			System.out.printf("%d < %d --- %s\n",a, b, false);
		}
		
		if(a >= b) {
			System.out.printf("%d >= %d --- %s\n",a, b, true);
		}else {
			System.out.printf("%d >= %d --- %s\n",a, b, false);
		}
		
		if(a <= b) {
			System.out.printf("%d <= %d --- %s",a, b, true);
		}else {

			System.out.printf("%d <= %d --- %s",a, b, false);
		}
		
		
		
	}
}
