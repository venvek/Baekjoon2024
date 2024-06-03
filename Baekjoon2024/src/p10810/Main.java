package p10810;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] bucket=new int[n];
		
		for(int t =0; t<m; t++) {
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		
		for(int u = i - 1;u<=j-1; u++) {
			bucket[u] = k;
		} 
		}
		for(int u=0; u < bucket.length; u++) {
			System.out.print(bucket[u] + " ");
		}
		System.out.println();
		//System.out.println(Collections.frequency(Arrays.asList(bucket),1));
		}
	}


