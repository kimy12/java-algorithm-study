package algorithm.string01;

import java.util.Scanner;

public class String0102 {
	
	public String upperTolower(String str) {
		String answer = "";
		char[] strArr = str.toCharArray(); 
		for(char ch : strArr) {
			if(ch == Character.toUpperCase(ch)) {
				answer += Character.toLowerCase(ch);
			}else {
				answer += Character.toUpperCase(ch);
			}
		}
		return answer;
		
	}
	
	public static void main (String[] args) {
		String0102 t = new String0102();
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println(t.upperTolower(str));
	}
	
}
