package P2720;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int s;
		for(int i=0; i<num; i++) {
		int n =sc.nextInt();
		
		while(true)
		if(n<= 500 && n>25) {
			s = n/25;
			n -= (s*25);
			System.out.print(n + " ");
			
		} else if(n>10 ){
			s= n/10;
			n -= (s*10);
			System.out.print(n + " ");
			
		} else if(n>5) {
			s= n/5;
			n -= (s*5);
			System.out.print(n + " ");
		
		} else if(n>1) {
			s= n/1;
			n -= (s*1);
			System.out.print(n + " ");
			return ;
		}
		else {
			break;
		}
		}
	}
}
