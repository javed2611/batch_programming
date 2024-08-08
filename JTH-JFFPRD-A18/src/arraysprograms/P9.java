// WAP to check if the array is palindrome or not.
package arraysprograms;
public class P9 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 0, 2, 1 };
		int[] b = a.clone();
		for (int i = 0, j = b.length - 1; i < b.length / 2; i++, j--) {
			a[i] = a[i] + a[j];
			a[j] = a[i] - a[j];
			a[i] = a[i] - a[j];
		}
		boolean flag = true;
		for (int i = 0; i < b.length; i++) {
			if (a[i] != b[i]) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}
}



