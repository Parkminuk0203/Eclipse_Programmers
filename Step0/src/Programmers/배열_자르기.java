package Programmers;
import java.util.*;
public class 배열_자르기 {

	public static void main(String[] args) {
//		int[] numbers1 = new int[] {1,2,3,4,5};
		int[] numbers1 = new int[] {1,3,5};
		int start = 0, end = 0, index = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 : ");
		start = sc.nextInt();
		System.out.print("끝 : ");
		end = sc.nextInt();
		int[] freq = new int[end - start + 1];
		
		for(int i=start; i<=end; i++) {
			freq[index] = numbers1[i];
			index++;
		}
		
		System.out.println(Arrays.toString(freq));

		
		
	} // end of main
	
} // end of class

