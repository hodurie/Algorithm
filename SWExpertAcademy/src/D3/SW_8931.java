package D3;

import java.util.Scanner;

public class SW_8931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t = 0; t < T; t++) {
            int K = sc.nextInt();
            int[] arr = new int[K];
            
            int pos = 0;
            
            for(int i = 0; i < K; i++) {
                int num = sc.nextInt();
                
                if(num == 0) { 
                	pos--;
                }else {
                	arr[pos] = num;
                	pos++;
                }
            }
            int sum = 0;
            for(int i = 0; i < pos; i++) {
            	sum += arr[i];
            }
            System.out.printf("#%d %d\n", (t+1), sum);
        }
    }    

}
