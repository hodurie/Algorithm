package LanguageCoder;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String215 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] a = new String[2];
		
		int mul = 1;
		
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.next();
		}
		Pattern p = Pattern.compile("^[0-9]{1,}");
		
		for(int i = 0; i < a.length; i++) {
			Matcher m = p.matcher(a[i]);
			if(m.find()) {
				mul *= Integer.valueOf(m.group());
			}
		}
		System.out.println(mul);
	}
}
