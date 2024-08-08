// WAP to find the largest number in the array.
package arrayprogram;

public class P6 {
	public static void main(String[] args) {
		int[] a = { 6, 18, 23, 5, 10 };
		int large = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > large) {
				large = a[i];
			}
		}
		System.out.println(large);
	}
}
