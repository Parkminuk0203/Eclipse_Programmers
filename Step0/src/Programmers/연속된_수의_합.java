package Programmers;

public class 연속된_수의_합 {

	public static void main(String[] args) {

	} // end of main
	public static int[] solution(int num, int total) {
		int[] answer = new int[num]; // 매개변수 num으로 배열 사이즈 정함
		
		int nsum = num*(1+num)/2;
		int start = (total - nsum) / num;
		
		
		
		return answer;
	}
} // end of class
