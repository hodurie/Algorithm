import java.util.Scanner;

public class Function236 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		rec(a,b,c);
	}
	
	public static void rec(int a, int b, int c) {
		int d = a * b * c;
		int m = 1;
		while(d > 0) {
			if(d%10 != 0) {
				m = m*(d%10);
			}
			d /= 10;
		}
		System.out.println(m);
	}
}
