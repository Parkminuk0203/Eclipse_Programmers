package Programmers;
import java.util.*;
public class �迭��_��հ� {

	public static void main(String[] args) {
		System.out.println(solution(new int[]{1,2,3,4,5,6,7,8,9,10})); 
	} // end of main
	public static double solution(int[] numbers) {
		double answer = 0;
		int sum = 0;
		double avg = 0;
		
		for(int i=0; i<numbers.length; i++) {
			sum += numbers[i];
		}
		
		avg = (double)sum/numbers.length;
		answer = avg;
		return answer;
	}

} // end of class
