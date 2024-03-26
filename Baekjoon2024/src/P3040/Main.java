package P3040;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] hat = new int[9];
		int sum = 0;
		while (true) {
			hat[sum] = sc.nextInt();
			if (hat[sum] == 100) {
				break;
			}
			System.out.println(hat[sum]);
			sum++;
		}
		sc.close();
	}
}
