package Programmers;

public class 숫자_비교하기 {

	public static void main(String[] args) {
		System.out.println(solution(3,3));
	} // end of main
	public static int solution(int num1, int num2) {
		int answer = 0;
		
		if(num1 == num2) {
			answer = 1;
		}
		else {
			answer = -1;
		}
		
		return answer;
	}
} // end of class
