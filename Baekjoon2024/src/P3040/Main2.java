package P3040;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] hat = new int[9];
		for (int i = 0; i < hat.length; i++) {
			hat[i] = sc.nextInt();
		}
		sc.close();

		for (int i=0; i<hat.length; i++) {
			System.out.print(hat[i] + " ");
		//9���� �� �� ���ϱ�
			int sum =0;
			for(int i=0; i<hat.length; i++) {
				sum+=hat[i];
			}
			System.out.println("sum :" + sum);
		    
			// �հ迡�� ���� �� 2���� ���� ����
			for(int i = 0; i < hat.length; i++)
				for(int j = 0; j < hat.length; j++) {
					if( i!=j) {
						System.out.print(i + " : " + j + " = " + (hat[i] + hat[j]));
					}
				}
		}
	}
}
