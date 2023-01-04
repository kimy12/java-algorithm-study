package algorithm.string01;

import java.util.Scanner;

public class String0110 {
	
public int[] solution(String str) {
		
		String[] strArr =str.split(" ");
		String el1 = strArr[0];
		char el2 = strArr[1].charAt(0);
		int[] result = new int[el1.length()];
		int num = 1000;
		
		for(int i=0; i<el1.length(); i++) {
			if(el2 != el1.charAt(i)) {
				num ++;
				result[i] = num;
			} else {
				num = 0;
				result[i] += num;
			}
		}
		
		
		num = 1000;
		for(int i=el1.length()-1; i>=0 ; i--) {
			if(el2 == el1.charAt(i)) {
				num = 0;
			} else {
				num++;
				if(result[i] > num) result[i] = num;
			} 
		}
		
		return result; 
	}
	
	public static void main(String[] args) {
		
		String0110 m = new String0110();
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		int [] rt = m.solution(str);
		
		for(int i=0; i<rt.length;i++) {
			System.out.print(rt[i]+" ");
		}
	}
	
}
