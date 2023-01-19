package algorithm.twoPointers03;

import java.util.Scanner;

public class twoPointers0305 {
	
	/*
	 N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.

		만약 N=15이면
		
		7+8=15
		
		4+5+6=15
		
		1+2+3+4+5=15
		
		와 같이 총 3가지의 경우가 존재한다.
	 */
	
	public int solution (int a, int[] arr) {
	
		int p1=0,p2=1, sum = 1, answer=0;
		
		while(arr[p1]+arr[p2] <= a) {
			if(sum < a) {
				sum += arr[p2++];
				if(sum == a)answer++;
			}
			else {
				sum = arr[++p1];
				p2=p1+1;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		twoPointers0305 m = new twoPointers0305();
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
			arr[i] = i+1;
		}
		
		System.out.println(m.solution(num, arr));
	}
}
