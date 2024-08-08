// WAP to find the largest number in array.
package arraysprogramming;
public class P9 {
	public static void main(String[] args) {
		int[] a = { 8, 5, 9, 3, 4, 1 };
		int large = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > large) {
				large = a[i];
			}
		}
		System.out.println(large);
	}
}
