package Programmers;

public class �粿ġ {

	public static void main(String[] args) {
		System.out.println(solution(64,6));
	} // end of main
	public static int solution(int n, int k) {
		int answer = 0, lamb = 0, juice = 0, service = 0, price;
		lamb = 12000; // �粿ġ 12000��
		juice = 2000; // �ֽ� 2000��
		
		if(n >= 10) {
			service = n/10;
		}
		
		price = (lamb*n) + (juice*k) - (service*juice);
		answer = price;
		
		return answer;
	}
} // end of class
