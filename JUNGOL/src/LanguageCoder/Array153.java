package LanguageCoder;
import java.util.Scanner;

public class Array153 {
	public static void main(String[] args) {
		int[] intArray = new int[100];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 100; i++) {
			int a = sc.nextInt();
			if(a != -1) {
				intArray[i] = a;
			}else {
				if(i < 3) {
					for(int j = 0; j < i; j++) {
						System.out.print(intArray[j] + " ");
					}
					break;
				}else {
						System.out.print(intArray[i-3] + " " + intArray[i-2] + " " + intArray[i-1]);
						break;
					}
				}
			}
		}
}
