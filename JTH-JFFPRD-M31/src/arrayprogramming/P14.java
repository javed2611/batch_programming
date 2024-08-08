// Bubble Sort
package arrayprogramming;

import java.util.Arrays;

public class P14 {
	public static void main(String[] args) {
		int[] a = { 8, 5, 7, 2,-4 };
		for (int i = 0; i < a.length -1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}
}
