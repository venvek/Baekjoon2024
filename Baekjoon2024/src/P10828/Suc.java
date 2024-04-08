package P10828;

import java.util.Scanner;
import java.util.Stack;

public class Suc {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			Stack<Integer> stk = new Stack<Integer>();
			
			int N = sc.nextInt();
			for(int i=0; i < N; i++) {
				String cmd = sc.next();
				System.out.println(cmd);
				
				switch(cmd) {
				case "push" :
					System.out.println("push");
					int param = sc.nextInt();
					System.out.println(param);
					
					stk.push(param);
					break;
				case "pop" :
					if(stk.empty()) {
						System.out.println();
					}
					System.out.println("pop");
					int ret=stk.pop();
					System.out.println(ret);
					break;
				case "size" :
					System.out.println("size");
					break;
				case "empty" :
					System.out.println("empty");
					if(stk.empty()) {
						System.out.println(1);
					}else {
						System.out.println(0);
					}
					break;
				case "top" :
					if(stk.empty()) {
						System.out.println(-1);
					} else {
						System.out.println(stk.peek());
					}
					break;			
				}
			}
			sc.close();
	}
}
