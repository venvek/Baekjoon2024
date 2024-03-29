package P2588;

import java.util.Scanner;

public class Main2 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt(); // 472
			int []b1 = new int[2];
			int b = sc.nextInt(); // 3 / 8 / 5

			sc.close();
			System.out.println(a * (b % 10));
			System.out.println(a * (b / 48));
			System.out.println(a * (b / 100));
			System.out.println(a * b);
		}
	}
	
