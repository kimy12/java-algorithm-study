package algorithm.string01;

import java.util.Scanner;

public class String0103 {
	
	public String solution (String str) {
		int num = Integer.MIN_VALUE;
		String a = "";
		
		String[] strArr = str.split(" ");
		for(String st : strArr) {
			int n = st.length();
			if(n > num) {
				num=n;
				a = st;
			}
		}
		return a;
	} 
	
	public static void main(String[] args) {
		String0103 m = new String0103();
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		System.out.println(m.solution(str));
	}
	
}
