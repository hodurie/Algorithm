import java.util.Scanner;

public class Control121 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		
		if(a > 0) {
			System.out.println("plus");
		}else if(a < 0) {
			System.out.println("minus");
		}else {
			System.out.println("zero");
		}
	}
}
