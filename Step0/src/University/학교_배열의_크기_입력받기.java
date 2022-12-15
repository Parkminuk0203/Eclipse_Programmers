package University;
import java.util.*;
public class 학교_배열의_크기_입력받기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기 입력 : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int[] freq = new int[size];
		String[] str = new String[size];
		
		
		Random rnd = new Random();
		
		// 난수 생성
		System.out.print("배열의 내용 : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = rnd.nextInt(100)+1;
		}
		
		Arrays.sort(arr);
		
		// 내림차순
		for(int i=0, j=arr.length-1; i<arr.length; i++,j--) {
			freq[i] = arr[j];
			System.out.print(freq[i] + " ");
		}
		
		int sum1=0, sum2=0;
		// 짝수 홀수의 합
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				sum1 += arr[i];
			} else {
				sum2 += arr[i];
			}
		}
		
		// 평균
		double avg = (sum1+sum2)/size;
		System.out.print("\n홀수의 합 : " + sum1);
		System.out.println("\n짝수의 합 : " + sum2);
		
		System.out.printf("평균의 합 : %.2f",avg);
	}

}
