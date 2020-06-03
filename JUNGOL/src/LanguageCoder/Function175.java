package LanguageCoder;
import java.util.Scanner;

public class Function175 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] b = new int[a];
		
		for(int i = 0; i < a; i++) {
			b[i] = sc.nextInt();
		}
		
		sort(b);
	}
	
	static void sort(int[] a) {
		for(int i = 0; i < a.length-1; i++) {
			for(int j = i + 1; j < a.length; j++) {
				if(a[j] > a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
}
