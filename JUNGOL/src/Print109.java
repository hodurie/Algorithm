import java.util.Scanner;

public class Print109 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		System.out.println("sum = " + (a+b+c));
		System.out.println("avg = " + (a+b+c)/3);
	}
}
