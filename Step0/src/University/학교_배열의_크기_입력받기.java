package University;
import java.util.*;
public class �б�_�迭��_ũ��_�Է¹ޱ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ũ�� �Է� : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int[] freq = new int[size];
		String[] str = new String[size];
		
		
		Random rnd = new Random();
		
		// ���� ����
		System.out.print("�迭�� ���� : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = rnd.nextInt(100)+1;
		}
		
		Arrays.sort(arr);
		
		// ��������
		for(int i=0, j=arr.length-1; i<arr.length; i++,j--) {
			freq[i] = arr[j];
			System.out.print(freq[i] + " ");
		}
		
		int sum1=0, sum2=0;
		// ¦�� Ȧ���� ��
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				sum1 += arr[i];
			} else {
				sum2 += arr[i];
			}
		}
		
		// ���
		double avg = (sum1+sum2)/size;
		System.out.print("\nȦ���� �� : " + sum1);
		System.out.println("\n¦���� �� : " + sum2);
		
		System.out.printf("����� �� : %.2f",avg);
	}

}
