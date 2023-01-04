package algorithm.array02;

import java.util.ArrayList;
import java.util.Scanner;

public class Array0202 {
	
	public int solution (int n, int[] arr) {
		int rt = 1;
		
		int num = arr[0];
		for(int i=1; i<n; i++) {
			if(arr[i] > num) {
				rt++;
				num = arr[i];
			}
		}
		
		return rt;
	}
	
	public static void main (String[] args) {
		Array0202 m = new Array0202();
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int[] intArr = new int[num];
		
		for(int i=0; i<num; i++) {
			intArr[i] = scan.nextInt();
		}
		
		System.out.print(m.solution(num, intArr));
	}
	
}
