package LanguageCoder;
import java.util.Scanner;

public class Array159 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] iarr = new int[a];
		
		for(int i = 0; i < a; i++) {
			iarr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < a-1; i++) {
			for(int j = i+1; j < a; j++) {
				if(iarr[j] > iarr[i]) {
					int temp = iarr[i];
					iarr[i] = iarr[j];
					iarr[j] = temp;
				}	
			}
		}
		
		for(int i = 0; i < a; i++) {
			System.out.println(iarr[i]);
		}
	}
}
