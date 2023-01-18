package algorithm.twoPointers03;

import java.util.Scanner;

public class slidingWindow0303 {
	
	/*
	 현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.

		만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
		
		12 1511 20 2510 20 19 13 15
		
		연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
		
		여러분이 현수를 도와주세요.
	 */
	
	public int solution (int a, int b, int[] arr) {
	
		int sum, answer = 0;
		
		for(int k=0; k<b; k++) {
			answer += arr[k];
		}
		
		sum = answer;
		for(int i=b; i<a; i++) {
			sum += arr[i];
			sum -= arr[i-b];
			if(sum > answer) answer = sum;
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		slidingWindow0303 m = new slidingWindow0303();
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int num2 = scan.nextInt();
		
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(m.solution(num, num2, arr));
	}
}
