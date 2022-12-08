package Programmers;

import java.util.Arrays;

public class Â¦¼ö_È¦¼ö_°³¼ö {

	public static void main(String[] args) {
		int[] num_list1 = new int[] {1,2,3,4,5};
		int[] num_list2 = new int[] {1,3,5,7};
		int[] freq1 = new int[2];
		int[] freq2 = new int[2];
		int count = 0;
		
		// num_list1 Â¦¼ö È¦¼ö °³¼ö Ãâ·Â
		for(int i=0; i<num_list1.length; i++) {
			if(num_list1[i] % 2 == 0) {
				freq1[0]++;
			}
			else {
				freq1[1]++;
			}
		}
		
		for(int i=0; i<num_list2.length; i++) {
			if(num_list2[i] % 2 == 0) {
				freq2[0]++;
			}
			else {
				freq2[1]++;
			}
		}
		
		System.out.println(Arrays.toString(freq1));
		System.out.println(Arrays.toString(freq2));
		
	} // end of main
	
} // end of class

