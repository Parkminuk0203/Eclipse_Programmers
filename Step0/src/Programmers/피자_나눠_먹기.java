package Programmers;
import java.util.*;
public class ÇÇÀÚ_³ª´²_¸Ô±â {

	public static void main(String[] args) {
		System.out.println(solution(8));
	} // end of main
	public static int solution(int n) {
		int answer = 0;
        
        if( n%7 == 0) {
            answer = (n/7)* 1;
        } 
        else { 
        	answer = (n/7) * 1 + 1;
        }
        
		
		return answer;
	}
} // end of class
