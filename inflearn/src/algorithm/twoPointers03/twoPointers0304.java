package algorithm.twoPointers03;

import java.util.Scanner;

public class twoPointers0304 {
	
	/*
	 N개의 수로 이루어진 수열이 주어집니다.

		이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
		
		만약 N=8, M=6이고 수열이 다음과 같다면
		
		1 2 1 3 1 1 1 2
		
		합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.
	 */
	
	public int solution (int a, int b, int[] arr) {
	
		int p1=0,sum=0, answer=0;
		
		for(int p2=0; p2<a; p2++) {
				sum += arr[p2];
				if(sum == b)answer++;
			while(sum >= b) {
				sum -= arr[p1++];
				if(sum == b)answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		twoPointers0304 m = new twoPointers0304();
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
