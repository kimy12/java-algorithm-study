package algorithm.array02;

import java.util.ArrayList;
import java.util.Scanner;

public class Array0212 {
	
	/*
	 * 현수네 반 선생님은 반 학생들의 수학점수를 향상시키기 위해 멘토링 시스템을 만들려고 합니다.

		멘토링은 멘토(도와주는 학생)와 멘티(도움을 받는 학생)가 한 짝이 되어 멘토가 멘티의 수학공부를 도와주는 것입니다.
		
		선생님은 M번의 수학테스트 등수를 가지고 멘토와 멘티를 정합니다.
		
		만약 A학생이 멘토이고, B학생이 멘티가 되는 짝이 되었다면, A학생은 M번의 수학테스트에서 모두 B학생보다 등수가 앞서야 합니다.
		
		M번의 수학성적이 주어지면 멘토와 멘티가 되는 짝을 만들 수 있는 경우가 총 몇 가지 인지 출력하는 프로그램을 작성하세요.

	 * */
	
	public int solution (int a, int b, int[][] arr) {
		
		int answer = 0;
		int stu1, stu2, cnt;
		
		for(int i=1; i<a+1; i++) {
			for(int j=1; j<a+1; j++) {
				cnt=0;
				for(int x=0; x<b; x++) {
					stu1=0;
					stu2=0;
					for(int s=0; s<a; s++) {
						if(arr[x][s] == i) stu1 = s;
						if(arr[x][s] == j) stu2 = s;
					}
					if(stu1 < stu2) cnt ++;
				}
				if(cnt == b) answer++;
			}
		}
		
		return answer;
	}
	
	public static void main (String[] args) {
		
		Array0212 m = new Array0212();
		
		Scanner scan = new Scanner(System.in);
		
		int fstNum = scan.nextInt();
		int secNum = scan.nextInt();
		
		int[][] arr = new int[secNum][fstNum];
		
		for(int i=0; i<secNum; i++) {
			for(int k=0; k<fstNum; k++) {
				arr[i][k] = scan.nextInt();
			}
		}
		
		System.out.println(m.solution(fstNum, secNum, arr));
	}
	
	
}
