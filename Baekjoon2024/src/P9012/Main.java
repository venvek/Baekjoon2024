package P9012;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int left =0;
		int right =0;
		
		
		for(int i=0; i<a.length(); i++) {
		//	a.length()%2
			if(a.charAt(i)=='(') {
				left++;
			}else if(a.charAt(i)==')') {
				right++;
			} {
			if(right==left) {		
			System.out.println("YES");
		}else if(right != left ) {
			System.out.println("NO");
			} System.out.println(a.length());
		System.out.println(right);
			  System.out.println(left);
		
		
	}
}
	}
}
	


