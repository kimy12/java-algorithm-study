package algorithm.array02;

import java.util.ArrayList;
import java.util.Scanner;

public class Array0208 {
	
	/*
	 * N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.

		같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
		
		즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
		
		5
		87 89 92 100 76
	 * */
	
	public int[] solution (int a, int[] arr) {
		
		int[] rtArr = new int[a];
		for(int i=0; i<a; i++) {
			int num =1;
			for(int k=0; k<a; k++) {
				if(arr[i] < arr[k]) num++;
			}
			rtArr[i] = num;
		}
		
		return rtArr; 
	}
	
	public static void main(String[] args) {
		
		Array0208 t = new Array0208();
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int[] arr = new int[num]; 
		
		for (int i=0; i<num; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int x : t.solution(num, arr)) {
			System.out.print(x + " ");
		}
	}
	
}
