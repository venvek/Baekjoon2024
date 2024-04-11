package P10845;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*class Jque { 
	private 
}
*/
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Queue<Integer> qu = new LinkedList<>();
		int N = sc.nextInt();
		for(int i=0; i<N;i++) { 
			String cmd = sc.next();
		//	System.out.println(cmd);
			switch(cmd) {
			case "push" :
				int pa = sc.nextInt();
				qu.offer(pa);
				break;
			case "pop" :
				if(qu.isEmpty()) {
				System.out.println("-1");
				}else {
				int ret = qu.poll();
				}
				break;
			case "size" :
				int size = qu.size();
				System.out.println(size);
				break;
			case "empty" :
				if(qu==null) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			//	System.out.println("empty");
				break;
			case "front" :
				if(qu.isEmpty()) {
					System.out.println(-1);
				} else {
					int ret = qu.peek();
				} System.out.println(ret);
			//	System.out.println("front");
				break;
			case "back" : 
			//	System.out.println("back");
				if(qu.isEmpty()) {
					System.out.println(-1);
				} else {
					int ret = qu.peek
				} System.out.println();
				break;
				}
			sc.close();
			}
		}
	}
		
