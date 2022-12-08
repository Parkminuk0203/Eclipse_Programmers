package Programmers;
import java.util.*;
public class 배열_뒤집기 {

	public static void main(String[] args) {
		int[] arr1 = new int[] {1,2,3,4,5};
		int[] arr2 = new int[] {1,1,1,1,1,2};
		int[] arr3 = new int[] {1,0,1,1,1,3,5};
		int[] freq1 = new int[arr1.length];
		int[] freq2 = new int[arr2.length];
		int[] freq3 = new int[arr3.length];
		
		// arr1 뒤집기
		for(int i=0, j=arr1.length-1; i<arr1.length; i++, j--) {
			freq1[i] = arr1[j];
		}
		
		// arr2 뒤집기
		for(int i=0, j=arr2.length-1; i<arr2.length; i++, j--) {
			freq2[i] = arr2[j];
		}
		
		// arr3 뒤집기
		for(int i=0, j=arr3.length-1; i<arr3.length; i++, j--) {
			freq3[i] = arr3[j];
		}
		
		System.out.println(Arrays.toString(freq1));
		System.out.println(Arrays.toString(freq2));
		System.out.println(Arrays.toString(freq3));
		
	} // end of main
	
} // end of class
