package algorithm.string01;

import java.util.Scanner;

public class String0101 {
	
	public int selecStr(String str, char ch) {
		int a = 0;
		
		str = str.toUpperCase();
		ch = Character.toUpperCase(ch);
		char[] strArray = str.toCharArray();
		
		for(char ch2 : strArray) {
			if(ch == ch2) a++;
		}
		
		return a;
	}
	public static void main(String[] args) {
		
		String0101 m = new String0101();
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		char ch = scan.next().charAt(0);
		
		System.out.println(m.selecStr(str, ch));
	}
	
}
