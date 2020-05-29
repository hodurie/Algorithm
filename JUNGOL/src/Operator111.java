import java.util.Scanner;

public class Operator111 {
	public static void main(String[] args) {
		int kor, eng, math, com;
		kor = 0;
		eng = 0;
		math = 0;
		com = 0;
		
		Scanner scn = new Scanner(System.in);
		
		kor = scn.nextInt();
		eng = scn.nextInt();
		math = scn.nextInt();
		com = scn.nextInt();
		int sum = (kor + eng + math + com);
		
		
		System.out.printf("sum %d\n", (kor + eng + math + com));
		System.out.printf("avg %d", sum/4);
		
		
	}
}
