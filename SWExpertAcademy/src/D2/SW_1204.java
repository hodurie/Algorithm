package D2;

import java.util.Scanner;

public class SW_1204 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        
        for (int t = 0; t < T; t++) {
            int[] arr = new int[101];
            int num = sc.nextInt();
            int max = 0;
            
            for (int i = 0; i < 1000; i++) {
                int temp = sc.nextInt();
                arr[temp]++;
            }
            
            for (int i = 0; i < 100; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            for (int i = 100; i > -1; i--) {
                if (arr[i] == max) {
                    System.out.printf("#%d %d\n",num, i);
                    break;
                }
            }

        }

    }

}

