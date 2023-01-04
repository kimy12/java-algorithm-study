package algorithm.string01;

import java.util.Scanner;

public class String0107 {
	
	public String solution (String str){
			
			char[] charArray = str.toCharArray();
			int num = charArray.length-1;
			String message="";
			
			for(int i=0; i<charArray.length/2; i++){
				if(Character.toUpperCase(str.charAt(i))==Character.toUpperCase(str.charAt(num))){
					num --;
				} else {
					message="NO";
				}
			}
			if("".equals(message))message="YES";
			return message;
		}
		
		public static void main(String[] args){
			String0107 m = new String0107();
			Scanner scan = new Scanner(System.in);
			String str = scan.next();
			System.out.println(m.solution(str));
		}
	
}
