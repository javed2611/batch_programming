// WAP to find the second largest element in the array.
package arraysprogramming;
public class P10 {
	public static void main(String[] args) {
		int[] a = { 18, 5, 9, 2, 18, 3, 1 };
		int large = Integer.MIN_VALUE, slarge = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > large) {
				slarge = large;
				large = a[i];
			} else if (a[i] > slarge && a[i] != large) {
				slarge = a[i];
			}
		}
		System.out.println("The Largest " + large);
		System.out.println("The Second Largest " + slarge);
	}
}
