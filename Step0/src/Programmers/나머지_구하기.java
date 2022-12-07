package Programmers;

public class 나머지_구하기 {

	public static void main(String[] args) {
		System.out.println(solution(3,2));
	} // end of main
	public static int solution(int num1, int num2) {
		int answer = 0;
		int remainder = 0;
		
		remainder = num1 % num2;
		answer = remainder;
		
		return answer;
	}
} // end of class
