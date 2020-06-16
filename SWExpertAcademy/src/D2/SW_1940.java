package D2;
import java.util.Scanner;

public class SW_1940 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N; 
		int sum;
		int cnt;
		int a;
		int sub;
		
		for(int t = 0; t < T; t++) {
			N = sc.nextInt();
			sum = 0;
			a = 0;
			sub = 0;
			cnt = 0;
			
			for(int n = 0; n < N; n++) {
				cnt = sc.nextInt();
				
				if(cnt == 1) {
					a += sc.nextInt();
				}else if(cnt == 2) {
					sub = sc.nextInt();
					if(sum <sub) {
						a = 0;
					}else if(sub > a){
						a = 0;
					}else {
						a -= sub;
					}
				}
				
				sum += a;
			}
			
			System.out.printf("#%d %d\n",t+1, sum);
			
		}
	}
}
