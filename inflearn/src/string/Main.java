package string;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	/* 20 */
	/**/
	public ArrayList<Integer> solution (int num){
		ArrayList<Integer> arr = new ArrayList<>();
		
		int a=2;
		arr.add(1);
		arr.add(0);
		arr.add(1);
		arr.add(0,777);
		
		for(int i=2; i<num; i++) {
			for(int k=3; k<num; k++) {
				if(k%i == 0) arr.add(k,1);
				else arr.add(k,0);
			}
		}
		ArrayList<Integer> rtArr = new ArrayList<>();
		for(int i=0; i<arr.size(); i++) {
			if(arr.get(i) == 1)rtArr.add(i+1);
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		Main t = new Main();
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		
		for(int x : t.solution(num)) {
			System.out.print(x+" ");
		}
	}
	
}
