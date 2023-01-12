package algorithm.array02;

import java.util.ArrayList;
import java.util.Scanner;

public class Array0211 {
	
	/*
	 * 김갑동 선생님은 올해 6학년 1반 담임을 맡게 되었다.

		김갑동 선생님은 우선 임시로 반장을 정하고 학생들이 서로 친숙해진 후에 정식으로 선거를 통해 반장을 선출하려고 한다.
		
		그는 자기반 학생 중에서 1학년부터 5학년까지 지내오면서 한번이라도 같은 반이었던 사람이 가장 많은 학생을 임시 반장으로 정하려 한다.
		
		그래서 김갑동 선생님은 각 학생들이 1학년부터 5학년까지 몇 반에 속했었는지를 나타내는 표를 만들었다.
		
		예를 들어 학생 수가 5명일 때의 표를 살펴보자.


	 * */
	
	public int solution(int num, int[][] arr) {
		
		int student = 0, count, answer= Integer.MIN_VALUE;
		
		
		for (int i =0; i<num; i++) {
			count=0;
			for(int k=0; k<num; k++) {
				for(int x=0; x<5; x++) {
						if(arr[i][x] == arr[k][x]) {
							count++;
							break;
						}
				}
			}
			if(count > answer) {
				answer = count;
				student = i;
			}
		}
		
		return student+1;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Array0211 t = new Array0211();
		
		int num = scan.nextInt();
		int[][] arr = new int[num][5];
		
		for (int i=0; i<num; i++) {
			for(int k=0; k<5; k++) {
				arr[i][k]= scan.nextInt();
			}
		}
		System.out.println(t.solution(num, arr));
	}
	
	
}
