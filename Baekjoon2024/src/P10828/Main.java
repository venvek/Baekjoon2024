package P10828;

import java.util.Scanner;
//import java.util.Stack;

class JSStack {
		int[] ar;
		int top;
		
		public JSStack() {
			ar = new int[100];
			top = -1;
		}
		public void push(int param) {
			ar[++top] = param;
		}
	
		public int size() {
			return top + 1;
		}

		public int pop() {
			return ar[top--];
		}

		public void empty() {
			if (top == -1) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}

		public void top() {
			if (top == -1) {
				System.out.println(-1);
			} else {
				System.out.println(ar[top]);
			}
		}
	}
		
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String cmd = sc.next();
	}

}
}
