package algorithm.array02;

import java.util.ArrayList;
import java.util.Scanner;

public class Array0206 {
	
	/*N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.

	예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.*/
	
	/* (예시입력)
	 * 9
	32 55 62 20 250 370 200 30 100*/
	
	public boolean isPrime (int num) {
		
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public ArrayList<Integer> solution (int num,int[] arr) {
		
		ArrayList<Integer> intArr = new ArrayList<>();
		
		String nstr = "";
		for(int i=0; i<num; i++) {
			nstr = new StringBuilder(String.valueOf(arr[i])).reverse().toString();
			if(Integer.parseInt(nstr) > 1 && isPrime(Integer.parseInt(nstr))) intArr.add(Integer.parseInt(nstr)) ;
		}
		
		return intArr;
	}
	
	public static void main(String[] args) {
		
		Array0206 t = new Array0206();
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int[] nArr = new int[num];
		
		for(int i=0; i<num; i++) {
			nArr[i] = scan.nextInt();
		}
		
		for(int x : t.solution(num, nArr)) {
			System.out.print(x+" ");
		}
		
	}

	
	
}
