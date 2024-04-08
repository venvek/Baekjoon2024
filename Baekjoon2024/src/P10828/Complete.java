package P10828;

		import java.util.Scanner;
		import java.util.Stack;
import java.util.StringTokenizer;

		public class Complete {
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				Stack<Integer> stk = new Stack<Integer>();

	//			int N = sc.nextInt();
				int N = Integer.parseInt(br.readLine());
				for (int i = 0; i < N; i++) {
	//				String cmd = sc.next();
					String cmd = br.readLine();

				StringTokenizer st = new StringTokenizer(br.readLine());
				if(st.countTokens() == 2) {
					System.out.println(st.nextToken());
					value = Integer.parseInt(nextToken());
				}else {
					cmd = st.nextToken();
				}
					switch (cmd) {
					case "push":
						int param = sc.nextInt();
						stk.push(param);
						break;
					case "pop":
						if (stk.empty()) {
							System.out.println("-1");
						} else {
							int ret = stk.pop();
							System.out.println(ret);
						}
						break;
					case "size":
						System.out.println(stk.size());
						break;
					case "empty":
						if (stk.empty()) {
							System.out.println(1);
						} else {
							System.out.println(0);
						}
						break;
					case "top":
						if (stk.empty()) {
							System.out.println(-1);
						} else {
							System.out.println(stk.peek());
						}
						break;
					}
				}
		//		sc.close();
			}
		}
