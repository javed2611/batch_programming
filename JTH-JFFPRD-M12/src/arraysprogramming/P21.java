package arraysprogramming;

import java.util.Arrays;

public class P21 {
	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4, 0, 0, 0 };
		int m = 3;
		int[] a2 = { 2, 3, 4 };
		int n = 3;
		int[] res = new int[m + n];
		int k = 0;
		for (int i = 0; i < m; i++) {
			res[k++] = a1[i];
		}
		for (int i = 0; i < n; i++) {
			res[k++] = a2[i];
		}
		Arrays.sort(res);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}
}
