// WAP to display the elements of the array where the last
// digit of element should be 0.
package arraysprogramming;

public class P6 {
	public static void main(String[] args) {
		int[] a = { 11, 20, 45, 410, 2410, 33, 85, 114, 700, 520 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 10 == 0) {
				System.out.println(a[i]);
			}
		}
	}
}
