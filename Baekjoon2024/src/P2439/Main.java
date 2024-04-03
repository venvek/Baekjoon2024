package P2439;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			for (int s=n-i-1; s>0; s--) {
			System.out.print(" ");
		}
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}sc.close();
	}
}
