package Programmers;
import java.util.*;
public class ���ڿ�_������ {

	public static void main(String[] args) {
		System.out.println(solution("jaron"));
	} // end of main
	public static String solution(String my_string) {
		String answer = "";
		String[] str = my_string.split(""); // �� ���ھ� �迭�� ����
		
		for(int i = str.length-1; i >= 0; i--) {
			answer += str[i];
		}
		
		return answer;
	}
} // end of class
