package D2;
import java.util.Scanner;

public class SW_2001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
	
		for (int t = 1; t < N + 1; t++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int[][] c = new int[a][a];
			int sum = 0;
			
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < a; j++) {
					c[i][j] = sc.nextInt();
				}
			}

			
			for (int k = 0; k < a - b + 1; k++) {	
				for (int l = 0; l < a - b + 1; l++) {
					int temp = 0;
					for(int m = k; m < k+b; m++) {
						for(int n = l; n < l+b; n++) {
							temp += c[m][n];
						}
					}
					if (temp >= sum) {
						sum = temp;
					}				
				}
			}
			System.out.printf("\n#%d %d",t,sum);
		}
	}
}
