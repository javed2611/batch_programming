// WAP to find the sum of all the elements in the array
package arraysprogramming;

public class P3 {
	public static void main(String[] args) {
		int[] a = { 4, 5, 8, 1, 2 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);
	}
}
