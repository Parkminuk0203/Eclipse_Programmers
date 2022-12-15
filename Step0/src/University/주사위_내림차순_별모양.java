package University;
import java.util.*;
public class 주사위_내림차순_별모양 {

	public static void main(String[] args) {
		int[] dice = new int[100];
		int[] freq = new int[7];
		int[] freq2 = new int[7];
		Random rnd = new Random();
		
		// 난수 생성
		for(int i=0; i<dice.length; i++) {
			dice[i] = rnd.nextInt(6)+1;
		}
		
		// 빈도 배열
		for(int i=0; i<dice.length; i++) {
			freq[dice[i]]++;
		}
		
		// 내림차순 정렬
		Arrays.sort(freq);
		
		// 오름차순 정렬
		for(int i=1,j=freq.length-1; i<freq.length; i++,j--) {
			freq2[i] = freq[j];
		}
		
		// 출력
		for(int i=1; i<freq2.length; i++) {
			System.out.printf("%d[%d]:",i,freq2[i]);
			for(int j=0; j<freq2[i];j++) {
				System.out.print("*");
			}
			System.out.println();
		}
 		
		
	} // end of main

} // end of class
