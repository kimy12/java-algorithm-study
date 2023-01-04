package algorithm.string01;

import java.util.Scanner;

public class String0112 {
	
	public String solution (int num, String str) {
		String rt ="";
		str = str.replaceAll("[#]", "1");
		str = str.replaceAll("[*]", "0");
		
		for(int i=0; i<num; i++) {
			String s = str.substring(0,7);
			int result = Integer.parseInt(s,2);
			char rs = (char)result;
			rt += String.valueOf(rs);
			str = str.substring(7);
		}
		
		return rt;
	}
	
	public static void main (String[] args) {
		String0112 m = new String0112();
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		String str = scan.next();
		
		System.out.println(m.solution(num, str));
	}
	
}
