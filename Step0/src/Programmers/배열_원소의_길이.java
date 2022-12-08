package Programmers;
import java.util.*;
public class 배열_원소의_길이 {

	public static void main(String[] args) {
		String[] strlist = new String[] {"We", "are", "the", "world!"};
//		String[] strlist = new String[] {"I", "Love", "Programmers."};		
		int[] freq = new int[strlist.length]; //.length는 int로 반환하기 때문에 int[] 배열로 바꿔줘야한다.
		
		for(int i=0; i<strlist.length; i++) {
			freq[i] = strlist[i].length(); 
		}
		
		System.out.println(Arrays.toString(freq));
	} // end of main
	
} // end of class

