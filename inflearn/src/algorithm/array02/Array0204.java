package algorithm.array02;

import java.util.ArrayList;
import java.util.Scanner;

public class Array0204 {
	
	public ArrayList<Integer> solution (int num){
		ArrayList<Integer> arr = new ArrayList<>();
		
		int a=1;
		int b=1;
		arr.add(a);
		arr.add(b);
		
		int rt = 0;
		for(int i=2; i<num; i++) {
			rt = arr.get(i-1)+arr.get(i-2);
			arr.add(rt);
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		Array0204 t = new Array0204();
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		
		for(int x : t.solution(num)) {
			System.out.print(x+" ");
		}
	}
	
}
