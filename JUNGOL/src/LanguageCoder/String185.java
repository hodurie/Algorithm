package LanguageCoder;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String185 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		Pattern p = Pattern.compile(b);
		Matcher m = p.matcher(a);
		
		int[] arr = new int[100];
		int i = 0;
		
		if(a.contains(b)) {
			while(m.find()) {
				arr[i] = m.start();
				i++;
			}
			System.out.println(arr[0]);
			
		}else {
			System.out.println("No");
		}
		
		
	}
}
