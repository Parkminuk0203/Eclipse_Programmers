package Programmers;
import java.util.*;
public class �ﰢ����_�ϼ����� {

	public static void main(String[] args) {
	/* 1. ���� �� ���� ���̴� �ٸ� �� ���� �պ��� �۾ƾ� �Ѵ�.
	 * 2. �� ������ �ﰢ���� ���� �� �ִٸ� 1
	   3. ������ 2 
	*/
		Scanner sc = new Scanner(System.in);
		int[] sides = new int[] {1,2,3};
//		int[] sides = new int[] {3,6,2};
//		int[] sides = new int[] {199,72,222};
		Arrays.sort(sides);
		
		if (sides[2] < sides[0] + sides[1]) {
			System.out.print(1);
		} 
		else {
			System.out.print(2);
		}
		
		
	} // end of main
	
} // end of class
