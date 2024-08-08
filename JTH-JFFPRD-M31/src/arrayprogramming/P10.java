// WAP to reverse the array
package arrayprogramming;

import java.util.Arrays;
public class P10 {
	public static void main(String[] args) {
		int[] a = { 25, 75, 31, 24 };
		System.out.println("Original array " + Arrays.toString(a));
		int i = 0, j = a.length - 1;
		while (i < a.length / 2) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		System.out.println("Reverse Array " + Arrays.toString(a));
	}
}
