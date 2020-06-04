package LanguageCoder;
import java.util.Scanner;

public class Function180 {
	public static void main(String[] args) {
		int N = 7;
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < N - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
