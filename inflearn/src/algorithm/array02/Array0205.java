package algorithm.array02;

import java.util.ArrayList;
import java.util.Scanner;

public class Array0205 {
	
	/*자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.

	만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.*/
	
  public int solution (int num){
		
		int answer=0;
		
		int[] intArr = new int[num+1];
		
		for(int i=2; i<=num; i++) {
			if(intArr[i] == 0) {
				answer++;
				for(int k=i; k<=num; k+=i) {
					intArr[k]=1;
				}
			}
		}
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		Array0205 t = new Array0205();
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		System.out.println(t.solution(num));
	}


	
}
