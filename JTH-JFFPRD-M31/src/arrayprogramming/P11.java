package arrayprogramming;

import java.util.Arrays;

public class P11 {
	public static void main(String[] args) {
		int[] a = { 11, 22, 33, 22, 11 };
		System.out.println("a " + Arrays.toString(a));
		int[] b = new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		System.out.println("b " + Arrays.toString(b));

		int[] c = a.clone();
		System.out.println("c " + Arrays.toString(c));

		int[] d = Arrays.copyOf(a, a.length);
		System.out.println("d " + Arrays.toString(d));

		int[] e = new int[a.length];
		System.arraycopy(a, 0, e, 0, a.length);
		System.out.println("e " + Arrays.toString(e));
	}
}
