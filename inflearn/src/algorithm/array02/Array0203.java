package algorithm.array02;

import java.util.ArrayList;
import java.util.Scanner;

public class Array0203 {
	
	public ArrayList<String> solution (int num, int[] a, int[] b){
		ArrayList<String> arr = new ArrayList<>();
		
		for(int i=0; i<num; i++) {
			if(a[i] == b[i]) arr.add("D");
			else if (a[i] == 1 && b[i] == 2 || b[i] == 3 && a[i] == 2 || b[i] == 1 && a[i] == 3) arr.add("B");
			else arr.add("A");
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		Array0203 t = new Array0203();
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int[] aArr = new int[num];
		int[] bArr = new int[num];
		
		for(int i =0; i<num; i++) {
			aArr[i] = scan.nextInt();
		}
		
		for(int i =0; i<num; i++) {
			bArr[i] = scan.nextInt();
		}
		
		for(String x : t.solution(num, aArr, bArr)) {
			System.out.println(x);
		}
	}
	
}
