package Programmers;

public class ¼¼±Õ_Áõ½Ä {

	public static void main(String[] args) {
		System.out.println(solution(2,10));
	} // end of main
	public static int solution(int number, int time) {
		int answer = 0;
		
		for(int i=0; i<time; i++) {
			number *= 2;
		}
		answer += number;
		return answer;
		
	}
} // end of class
