package Programmers;
import java.util.*;
public class 문자열_뒤집기 {

	public static void main(String[] args) {
		System.out.println(solution("jaron"));
	} // end of main
	public static String solution(String my_string) {
		String answer = "";
		String[] str = my_string.split(""); // 한 문자씩 배열에 저장
		
		for(int i = str.length-1; i >= 0; i--) {
			answer += str[i];
		}
		
		return answer;
	}
} // end of class
