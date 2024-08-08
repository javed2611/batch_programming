// WAP to print the largest number in the array.
package arraysprograms;
public class P12 {
	public static void main(String[] args) {
		int[] a = { 7, 4, 21, 5, 41 };
//		int large = Integer.MIN_VALUE;
		int large = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > large) {
				large = a[i];
			}
		}
		System.out.println(large);
	}
}
