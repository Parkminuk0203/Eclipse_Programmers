package Programmers;
import java.util.*;
public class 짝수의_합 {

	public static void main(String[] args) {
		System.out.println(solution(10)); 
	} // end of main
	public static int solution(int n) {
		int sum = 0;
		for(int i=0; i<=n; i++) { // 10도 포함이 되어야 하여 <= 사용
			if(i % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}

} // end of class
