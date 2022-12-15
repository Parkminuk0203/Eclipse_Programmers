package University;

public class 학교_2차원배열_구구단 {

	public static void main(String[] args) {
		int[][] arr = new int[3][9]; // 3행 9열
		
		for(int i=0; i<arr.length; i++) { // 행의 길이
			for(int j=0; j<arr[i].length; j++) { // 열의 길이
				arr[i][j] = (i+2) * (j+1);
				System.out.printf("%d * %d = %d \n",(i+2),(j+1),arr[i][j]);
			}
			System.out.println();
		}

		
	} // end of main

} // end of class
