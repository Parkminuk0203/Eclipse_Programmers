package University;

import java.util.*;

public class 주사위_20개씩_출력 {

	public static void main(String[] args) {
		int[] arr = new int[100];
		Random rnd = new Random();

		System.out.println("#### 주사위 100번 던진 결과 ####");
		
		// 난수생성
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextInt(6) + 1;
			System.out.print(arr[i]+" ");
			if((i+1) % 20 == 0) {
				System.out.println();
			}
		}

	} // end of main

} // end of class
