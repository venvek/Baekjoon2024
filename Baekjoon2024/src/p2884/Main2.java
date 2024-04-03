package p2884;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
        if (M >= 45) {
            M = M-45;
            System.out.printf("%d %d\n", H, M);
        }
        else if (H == 0 && M < 45) {
            M = 45 - M;
            int c = 60 - M;
            H = 23;
            System.out.printf("%d %d\n", H, c);
        }
        else {
            int a = 45-M;
            int b = 60*H - a;
            System.out.printf("%d %d\n", b/60, b%60);
        }
        sc.close();
    }
}
	
