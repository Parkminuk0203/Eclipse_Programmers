package Programmers;

public class �ڸ���_���ϱ� {

	public static void main(String[] args) {
		System.out.println(solution(1234));
	} // end of main
	
	public static int solution(int n) { // int n = 1234
	        int answer = 0;	            
	        
	        while(n>0){                 // 1. 1234�� 0���� Ŭ ����
	            answer+=n%10;           // 2. answer�� 1234%10=4�� ���Ѵ�.
	            n/=10;                  // 3. 1234/10�� �Ͽ� 123�� n�� �����Ѵ�. �۾��������� �ݺ�
	        }

	        return answer;
	    }
	
} // end of class

