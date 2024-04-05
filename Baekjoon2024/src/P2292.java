import java.util.Scanner;

public class P2292 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a =1;
		int n =0;
		int b =0;
		int c =0;
		
		while(true) {
			a += 6*n;
			c = a+6*(n+1);
			if(a<N && N<=c) {
				b = n;
				break;
			}
			n++;
		}
	}
}/*	if(N<=7) {
			System.out.println("2");
		}
		else if(N<=13) {
			System.out.println("3");		
		}else if (N<=37) {
		System.out.println("4");
		}else if (N<=61) {
			System.out.println("5");*/