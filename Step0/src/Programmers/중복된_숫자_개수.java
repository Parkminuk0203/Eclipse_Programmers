package Programmers;
import java.util.*;
public class 중복된_숫자_개수 {

	public static void main(String[] args) {
		System.out.println(solution(new int[]{1,1,2,3,4,5}, 1));
	} // end of main
	public static int solution(int[] array, int n) {
		int answer = 0;
		for(int i=0; i<array.length; i++) {
			if(array[i] == n) {
				answer++;
			}
		}
		return answer;
	}
} // end of class
