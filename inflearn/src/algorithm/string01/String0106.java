package algorithm.string01;

import java.util.Scanner;

public class String0106 {
	
	public String solution (String str) {
			
			String result = "";
			char[] charArray = str.toCharArray();
			for(int i=0; i<charArray.length; i++) {
				if(i == str.indexOf(charArray[i])) result +=charArray[i];
			}
			
			return result;
		}
		
		public static void main(String[] args) {
			String0106 m = new String0106();
			Scanner scan = new Scanner(System.in);
			
			String str = scan.next();
			System.out.println(m.solution(str));
		}
	
}
