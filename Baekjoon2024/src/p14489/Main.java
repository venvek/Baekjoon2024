package p14489;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int sum =A+B;
		int ck = sc.nextInt();
		
		if(sum >= (ck*2)) {
			System.out.print(sum -(ck*2));
		}
		else if(sum < (ck*2)) {
			System.out.println(A+B);
			
		}
	}

}
