//WAP to print product of all the odd numbers from the array
package arraysprogramming;

public class P5 {
	public static void main(String[] args) {
		int[] a = { 4, 5, 8, 1, 2 };
		int prod = 1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				prod = prod * a[i];
			}
		}
		System.out.println(prod);
	}
}
