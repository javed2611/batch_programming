// Insertion Sort
package arraysprogramming;
public class P24 {
	public static void main(String[] args) {
		int[] a = { 3, 5, 1, 4, 2 };
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j = i;
			while (j > 0 && a[j - 1] > temp) {
				a[j] = a[j - 1];
				--j;
			}
			a[j] = temp;
		}
		// to print the array
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
