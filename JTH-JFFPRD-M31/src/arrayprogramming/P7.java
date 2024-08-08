// WAP to find the largest number in the array.
package arrayprogramming;
public class P7 {
	public static void main(String[] args) {
		int[] a = {12,11,15,13,16,14};
		int large = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > large) {
				large = a[i];
			}
		}
		System.out.println(large);
	}
}
