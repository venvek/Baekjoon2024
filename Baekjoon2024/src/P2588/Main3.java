package P2588;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next();
		String num2 = sc.next();
		sc.close();
		
		System.out.println(num1 + " " + num2);
		int inum1 = Integer.parseInt(num1);
		
		int inum2 = num2.charAt(2)-'0';
		System.out.println(inum1 * inum2);
		
		inum2 = num2.charAt(1)-'0';
		System.out.println(inum1 * inum2);
		
		inum2 = num2.charAt(0)-'0';
		System.out.println(inum1 * inum2);
		
		inum2 = num2.charAt(1)-'0';
		System.out.println(inum1 * inum2);
		System.out.println(inum1 * Integer.parseInt(num2));
	}
}

