package LanguageCoder;

public class Array163 {
	public static void main(String[] args) {
		int[][] imat = {{3, 5, 9}, {2, 11, 5}, {8, 30, 10}, {22, 5, 1}};
		int a = 0;
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				a += imat[i][j];
				System.out.print(imat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.print(a);
	}
}
