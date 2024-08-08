// WAP to find the second largest element in array.
package arrayprogram;
public class P7 {
	public static void main(String[] args) {
		int[] a = { 10, 6, 23, 10, 5, 18, 23 };
		int large = 0;
		int slarge = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > large) {
				slarge = large;
				large = a[i];
			} else if (a[i] > slarge && a[i] != large) {
				slarge = a[i];
			}
		}
		System.out.println("The largest value is " + large);
		System.out.println("The second largest value is " + slarge);
	}
}
