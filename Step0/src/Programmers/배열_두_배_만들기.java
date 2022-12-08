package Programmers;
import java.util.*;
public class 배열_두_배_만들기 {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5};
		int[] arr2 = new int[] {1,2,100,-99,1,2,3};
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr[i]*2;
			arr2[i] = arr2[i]*2;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
	} // end of main
	
} // end of class
