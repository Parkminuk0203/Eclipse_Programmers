package Programmers;
import java.util.*;
public class �迭_������_���� {

	public static void main(String[] args) {
		String[] strlist = new String[] {"We", "are", "the", "world!"};
//		String[] strlist = new String[] {"I", "Love", "Programmers."};		
		int[] freq = new int[strlist.length]; //.length�� int�� ��ȯ�ϱ� ������ int[] �迭�� �ٲ�����Ѵ�.
		
		for(int i=0; i<strlist.length; i++) {
			freq[i] = strlist[i].length(); 
		}
		
		System.out.println(Arrays.toString(freq));
	} // end of main
	
} // end of class

