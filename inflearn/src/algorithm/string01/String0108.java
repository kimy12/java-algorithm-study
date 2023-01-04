package algorithm.string01;

import java.util.Scanner;

public class String0108 {
	
	public String solution(String str) {
			
			String answer = "YES";
			str = str.toUpperCase().replaceAll("[^A-Z]","");
			int num = str.length()-1;
			for(int i=0; i<str.length()/2 ;i++) {
				if(str.charAt(i) != str.charAt(num-i)) return "NO";
			}
			
			return answer;
		}
		
		public static void main(String[] args) {
			String0108 m = new String0108();
			Scanner scan = new Scanner(System.in);
			
			String str = scan.nextLine();
			System.out.println(m.solution(str));
		}
	
}
