// Selection Sort
package arraysprogramming;
public class P17 {
	public static void main(String[] args) {
		char[] a = {'m','a','h','e','s','h'};
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			char temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		// to print the array
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
