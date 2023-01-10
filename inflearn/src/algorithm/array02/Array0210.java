package algorithm.array02;

import java.util.ArrayList;
import java.util.Scanner;

public class Array0210 {
	
	/*
	 * 지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.

		각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
		
		격자의 가장자리는 0으로 초기화 되었다고 가정한다.
		
		만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.


	 * */
	
	public int solution (int num, int[][] arr) {
		int answer = 0;
		
		
		for(int i=1; i<num+1; i++) {
			for(int k=1; k<num+1; k++) {
				if(arr[i][k] > arr[i][k-1] && arr[i][k] > arr[i][k+1] && arr[i][k] > arr[i-1][k] && arr[i][k] > arr[i+1][k]) answer++;
			}
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		
		Array0210 t = new Array0210();
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int[][] arr = new int[num+2][num+2];
		
		
		for(int i=0; i<num+2; i++) {
			for(int k=0; k<num+2; k++) {
				if(i ==0 || i == num+1)arr[i][k] = 0;
				else if(k ==0 || k == num+1)arr[i][k] = 0;
				else arr[i][k] = scan.nextInt();
			}
		}
		
		System.out.println(t.solution(num, arr));
	}
	
}
