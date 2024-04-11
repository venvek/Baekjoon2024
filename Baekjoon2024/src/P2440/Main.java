package P2440;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Num = sc.nextInt();
		sc.close();

		for(int i=0; i<=Num;i++) {
			for(int j=i+1; j<=Num;j++) {
			System.out.print("*");
		}System.out.println(" ");
	}
}
}
