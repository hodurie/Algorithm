package D2;

import java.util.Scanner;

public class SW_2007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t = 1; t <= T; t++) {
			String str = sc.next();
			int cnt = 0;
			
			for(int i = 1; i < 10; i++) {
                String sub = str.substring(0, i);
                String subNext = str.substring(i, i + i);
                if(sub.equals(subNext)) {
                	cnt = i;
                    break;
                }
            }
            System.out.printf("#%d %d\n", t, cnt);
			
			
		}
	}
}
