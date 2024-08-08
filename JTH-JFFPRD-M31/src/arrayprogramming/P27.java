package arrayprogramming;

import java.util.Arrays;

public class P27 {
	static int[] a = { 10, 20, 30, 40 };

	public static void main(String[] args) {
		System.out.println(Arrays.toString(a));
		removeLast();
		System.out.println(Arrays.toString(a));
	}

	public static void removeLast() {
		if (a.length == 0) {
			System.out.println("Array is empty");
		} else {
			int[] b = new int[a.length - 1];
			for (int i = 0; i < b.length; i++) {
				b[i] = a[i];
			}
			a = b;
		}
	}

	public static void removeFirst() {
		if (a.length == 0) {
			System.out.println("Array is empty");
		} else {
			int[] b = new int[a.length - 1];
			for (int i = 0; i < b.length; i++) {
				b[i] = a[i + 1];
			}
			a = b;
		}
	}
}
