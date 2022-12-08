package Programmers;
import java.util.*;
public class 삼각형의_완성조건 {

	public static void main(String[] args) {
	/* 1. 가장 긴 변의 길이는 다른 두 변의 합보다 작아야 한다.
	 * 2. 세 변으로 삼각형을 만들 수 있다면 1
	   3. 없으면 2 
	*/
		Scanner sc = new Scanner(System.in);
		int[] sides = new int[] {1,2,3};
//		int[] sides = new int[] {3,6,2};
//		int[] sides = new int[] {199,72,222};
		Arrays.sort(sides);
		
		if (sides[2] < sides[0] + sides[1]) {
			System.out.print(1);
		} 
		else {
			System.out.print(2);
		}
		
		
	} // end of main
	
} // end of class
