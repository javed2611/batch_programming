// Bubble Sort
package arraysprograms;

public class P15 {
	public static void main(String[] args) {
//		int[] a = { 3, 5, 1, 4, 2 };
		char[] a = { 'R', 'o', 'o', 'h', 'a', 'n' };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					char temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
