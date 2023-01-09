package algorithm.array02;

import java.util.ArrayList;
import java.util.Scanner;

public class Array0209 {
	
	/*
	 * 5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
	 * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
	 * */
	
	public int solution (int num, int[][] arr) {
		
		int answer = Integer.MIN_VALUE;
		int sumA , sumB, sumC = 0;
		
		for(int i=0; i<num; i++) {
			sumA = sumB = 0;
			for(int k=0; k<num; k++) {
				sumA+=arr[i][k];
				sumB+=arr[k][i];
				if(sumA > sumB && sumA > answer) answer = sumA;
				else if ( sumB > sumA && sumB > answer) answer = sumB;
			}
		}
		
		for(int i=0; i<num; i++) {
			sumC += arr[i][i];
			if(sumC > answer) {
				return sumC;
			}
		}
		
		return answer; 
	}
	
	public static void main(String[] args) {
		
		Array0209 t = new Array0209();
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int[][] arr = new int[num][num]; 
		
		for (int i=0; i<num; i++) {
			for(int k =0; k<num; k++) {
				arr[i][k] = scan.nextInt();
			}
		}
		
		System.out.println(t.solution(num, arr));
	}
	
}
