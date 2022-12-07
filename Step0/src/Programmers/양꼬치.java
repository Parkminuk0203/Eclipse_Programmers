package Programmers;

public class ¾ç²¿Ä¡ {

	public static void main(String[] args) {
		System.out.println(solution(64,6));
	} // end of main
	public static int solution(int n, int k) {
		int answer = 0, lamb = 0, juice = 0, service = 0, price;
		lamb = 12000; // ¾ç²¿Ä¡ 12000¿ø
		juice = 2000; // ÁÖ½º 2000¿ø
		
		if(n >= 10) {
			service = n/10;
		}
		
		price = (lamb*n) + (juice*k) - (service*juice);
		answer = price;
		
		return answer;
	}
} // end of class
