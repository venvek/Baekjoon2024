package P2609;

import java.util.Scanner;

public class Main {
	/*
	 * static int result,n,m; static int [] c;
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int max;

		for(int i = 1; i<=m && i<=n; i++) {
			max = m*i;
			System.out.println(n*m/max);
			System.out.println(max);
			}
		}	
	}
	/*static int  min(int n, int m, int result) {
		for(int i =1; i<n;i++) {
	
		}
	}*/
	/*static int max(int N, int M) {
		
		for(int i = 1; i< 10; i++) {
		if ((N*i) == (M*i)) {
			result +=(N*i);
		System.out.println(result);
		
		}return 1;
			
		}	*/


