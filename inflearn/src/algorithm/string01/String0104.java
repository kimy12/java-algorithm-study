package algorithm.string01;

import java.util.Scanner;

public class String0104 {
	
public String solution (String str){
		
		String st = new StringBuilder(str).reverse().toString();
		return st;
	}
	
	public static void main(String[] args) {
		String0104 m = new String0104();
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String[] strArr = new String[num];
		for(int i=0 ; i<num; i++) {
			strArr[i] = scan.next();
		}
		for(String st : strArr) {
			System.out.println(m.solution(st));
		}
		
	}
	
}
