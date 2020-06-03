package LanguageCoder;
import java.util.Scanner;

public class Array155 {
	public static void main(String[] args) {
		char[] carr = {'J', 'U', 'N', 'G', 'O', 'L'};
		Scanner sc = new Scanner(System.in);
		
		char a = sc.next().charAt(0);
		
		for(int i = 0; i < carr.length; i++) {
			if(carr[i] == a) {
				System.out.println(i);
				break;
			}
			if((i == carr.length -1) && (carr[i] != a)) {
				System.out.println("none");
			}
		}
	}
}
