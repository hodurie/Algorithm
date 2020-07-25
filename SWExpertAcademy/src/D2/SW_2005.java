package D2;

import java.util.Scanner;

class SW_2005 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for(int t = 1; t <= T; t++) {
            System.out.printf("#%d\n", t);
            int n = sc.nextInt();
            int cur[] = new int[n + 2];
            int next[] = new int[n + 2];
            cur[1] = 1;
            for(int i = 1; i <= n; i++) {
                for(int j = 1; j < i + 1; j++) System.out.printf("%d ", cur[j]);
                System.out.println();
                for(int j = 1; j < i + 2; j++) next[j] = cur[j - 1] + cur[j];
                for(int j = 1; j < i + 2; j++) cur[j] = next[j];
            }
        }
    }
}