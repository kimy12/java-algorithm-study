package algorithm.string01;

import java.util.Scanner;

public class String0111 {
	
	public String solution(String str) {
		
		String result = "";
		
		char[] strArr = str.toCharArray();
		
		int chkNum=1;
		for(int i=0; i<str.length();i++) {
			if(i != str.length()-1) {
				if( strArr[i] != strArr[i+1] ) {
					result += String.valueOf(strArr[i]);
					if(chkNum > 1) {
						result += chkNum;
						chkNum = 1;
					} 
				} 
				else {
					chkNum ++;
				}
			} else {
				if(str.length()-1 != str.length()-2) {
					result += String.valueOf(strArr[str.length()-1]);
					if(chkNum > 1) result += chkNum;
				}
			}
		}
		
		return result; 
	}
	
	public static void main(String[] args) {
		
		String0111 m = new String0111();
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		System.out.print(m.solution(str));
	}
	
}
