package LanguageCoder;
import java.util.Scanner;

public class Operator115 {
	public static void main(String[] args) {
		int mh,mw,kh,kw;
		mh = 0; mw = 0; kh = 0; kw = 0;
		
		Scanner scn = new Scanner(System.in);
		
		mh = scn.nextInt();
		mw = scn.nextInt();
		kh = scn.nextInt();
		kw = scn.nextInt();
		
		if((mh > kh) && (mw > kw)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
