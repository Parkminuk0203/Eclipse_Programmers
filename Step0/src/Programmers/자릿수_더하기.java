package Programmers;

public class 자릿수_더하기 {

	public static void main(String[] args) {
		System.out.println(solution(1234));
	} // end of main
	
	public static int solution(int n) { // int n = 1234
	        int answer = 0;	            
	        
	        while(n>0){                 // 1. 1234가 0보다 클 동안
	            answer+=n%10;           // 2. answer에 1234%10=4를 더한다.
	            n/=10;                  // 3. 1234/10를 하여 123을 n에 대입한다. 작아질때동안 반복
	        }

	        return answer;
	    }
	
} // end of class

