package algorithm.twoPointers03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class twoPointers0302 {
	
	/*A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.*/
	
	public ArrayList<Integer> solution (int num1, int[] arr1, int num2, int[] arr2){
		
		ArrayList<Integer> answer = new ArrayList<>();
		int p1=0, p2=0;
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		while(p1<num1 && p2<num2) {
			if(arr1[p1] < arr2[p2]) p1++;
			else if (arr1[p1] == arr2[p2]) {
				answer.add(arr1[p1++]);
				p2++;
			} else p2++;
		}
		
		return answer;
	}
	
	public static void main (String[] args) {
		
		twoPointers0302 m = new twoPointers0302();
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int[] arr1 = new int[num1];
		
		for(int i=0; i<num1; i++) {
			arr1[i] = scan.nextInt();
		}
		int num2 = scan.nextInt();
		int[] arr2 = new int[num2];
		for(int i=0; i<num2; i++) {
			arr2[i] = scan.nextInt();
		}
		
		ArrayList<Integer> answer = m.solution(num1, arr1, num2, arr2);
		for(int i=0; i < answer.size(); i++) {
			System.out.print(answer.get(i)+" ");
		}
	}
}
