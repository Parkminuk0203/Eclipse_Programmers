package University;

public class �б�_2�����迭_������ {

	public static void main(String[] args) {
		int[][] arr = new int[3][9]; // 3�� 9��
		
		for(int i=0; i<arr.length; i++) { // ���� ����
			for(int j=0; j<arr[i].length; j++) { // ���� ����
				arr[i][j] = (i+2) * (j+1);
				System.out.printf("%d * %d = %d \n",(i+2),(j+1),arr[i][j]);
			}
			System.out.println();
		}

		
	} // end of main

} // end of class
