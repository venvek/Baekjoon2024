package Pp8958;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String quiz[] = new String[sc.nextInt()];
		
		for(int i=0; i < quiz.length; i++) {
			quiz[i] = sc.next();
		}
		sc.close();
		
		for(int i=0; i < quiz.length; i++) {
			int cnt = 0, sum= 0;  // ����Ƚ�� / ��
		
		for(int j =0; j < quiz[i].length(); j++) {
			if(quiz[i].charAt(j) == 'O') {
				cnt++;
			}else {
				cnt =0;
			}
			sum += cnt;
		}
		System.out.println(sum);
	}
}
}

