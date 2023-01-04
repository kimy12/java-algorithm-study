package algorithm.string01;

import java.util.Scanner;

public class String0109 {
	
	public int solution(String str) {
			
			int result =Integer.parseInt(str.toUpperCase().replaceAll("[^0-9]",""));
			
			return result; 
		}
		
	public static void main(String[] args) {
		
		String0109 m = new String0109();
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		System.out.println(m.solution(str));
	}
	
}
