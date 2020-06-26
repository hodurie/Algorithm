package D2;

import java.util.Scanner;

public class SW_1288 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 0; t < T; t++) {
			int n = sc.nextInt();
			int cnt = 0;
			int[] a = new int[10];
			while(true) {
				boolean check = false;
				for(int i = 0; i < 10; i++) {
					if(a[i] == 0) {
						check = true;
						break;
					}
				}
				
				if(check == false) {
					System.out.printf("#%d %d\n",t+1,(cnt)*n);
					break;
				}
				
				cnt++;
				String str = String.valueOf(n*cnt);
				for(int j = 0; j < str.length(); j++) {
					int tmp = str.charAt(j) - '0';
					a[tmp] = 1;
				}
			}
		}
		
	}
}
