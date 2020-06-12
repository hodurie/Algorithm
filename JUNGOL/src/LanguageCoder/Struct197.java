package LanguageCoder;
import java.util.Scanner;

public class Struct197 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[8];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 4; i++) {
			if(i < 2) {
				if(arr[i] < arr[i+4]) {
					System.out.print(arr[i] + " ");
				}else {
					System.out.print(arr[i+4] + " ");
				}
			}else {
				if(arr[i] < arr[i+4]) {
					System.out.print(arr[i+4] + " ");
				}else {
					System.out.print(arr[i] + " ");
				}
			}
			
		}
		
		
	}
}
