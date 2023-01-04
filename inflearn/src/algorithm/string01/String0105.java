package algorithm.string01;

import java.util.Scanner;

public class String0105 {
	
	public String solution (String str) {
			
			char[] chArr = str.toCharArray();
			int lt = 0;
			int rt = chArr.length - 1;
			while(lt<rt) {
				char c ;
				if(!Character.isAlphabetic(chArr[lt]) ) {
					lt ++;
				} else if(!Character.isAlphabetic(chArr[rt])) {
					rt--;
				} else {
					c = chArr[lt];
					chArr[lt] = chArr[rt];
					chArr[rt] = c;
					lt ++;
					rt--;
				}
			}
			str = String.valueOf(chArr);
			return str;
		}
		
		public static void main (String[] args) {
			String0105 m = new String0105();
			Scanner scan = new Scanner(System.in);
			
			String str = scan.next();
			System.out.println(m.solution(str));
		}
	
}
