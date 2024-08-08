package arrayprogram;

import java.util.Scanner;

public class P9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
//		int sumN = 0;
//		for (int i = 0; i <= n; i++) {
//			sumN = sumN + i;
//		}
		int sumN = n * (n + 1) / 2;
		int sumOfArray = 0;
		for (int i = 0; i < a.length; i++) {
			sumOfArray = sumOfArray + a[i];
		}
		System.out.println(sumN - sumOfArray);
	}
}
