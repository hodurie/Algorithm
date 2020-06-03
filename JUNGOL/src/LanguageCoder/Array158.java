package LanguageCoder;
import java.util.Scanner;

public class Array158 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int[] iarry = new int[100];
		
		while(true) {
			int a = sc.nextInt();
			if(a == 0) {
				break;
			}else {
				iarry[cnt] = a;
				cnt++;
			}
		}
		
		System.out.println(cnt);
		for(int i = 0; i < cnt; i++) {
			if(iarry[i] % 2 == 0) {
				System.out.print(iarry[i]/2 + " ");
			}else {
				System.out.print(iarry[i]*2 + " ");
			}
		}
	}
}
