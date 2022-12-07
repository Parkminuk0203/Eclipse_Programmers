package Programmers;

public class µÎ_¼öÀÇ_³ª´°¼À {

	public static void main(String[] args) {
		System.out.println(solution(3,2));
	} // end of main
	public static int solution(int num1, int num2) {
		double answer = 0;
		answer = ((double)num1/num2)*1000;
		return (int)answer;
	}
} // end of class
