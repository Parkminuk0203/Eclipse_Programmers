package University;

import java.util.*;

public class �ֻ���_20����_��� {

	public static void main(String[] args) {
		int[] arr = new int[100];
		Random rnd = new Random();

		System.out.println("#### �ֻ��� 100�� ���� ��� ####");
		
		// ��������
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextInt(6) + 1;
			System.out.print(arr[i]+" ");
			if((i+1) % 20 == 0) {
				System.out.println();
			}
		}

	} // end of main

} // end of class
