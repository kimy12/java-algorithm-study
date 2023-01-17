package algorithm.twoPointers03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	/*오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.*/
	/* 3
		1 3 5
		5
		2 3 6 7 9
	*/
	
	public ArrayList<Integer> solution (int num1, int[] arr1, int num2, int[] arr2){
		
		ArrayList<Integer> answer = new ArrayList<>();
		int p1=0, p2=0;
		
		while(p1<num1 && p2<num2) {
			if(arr1[p1] < arr2[p2]) answer.add(arr1[p1++]);
			else answer.add(arr2[p2++]);
		}
		
		while(p1<num1) answer.add(arr1[p1++]);
		while(p2<num2) {
			answer.add(arr2[p2++]);
		}
		
		return answer;
	}
	
	public static void main (String[] args) {
		
		Main m = new Main();
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
		for(int i=0; i < num1+num2; i++) {
			System.out.print(answer.get(i)+" ");
		}
	}
}
