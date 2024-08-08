package arrayprogramming;

public class P20 {
	public static void main(String[] args) {
		int[] a = { 1, 4, 3, 4 };
		int large = a[0], small = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > large) {
				large = a[i];
			}
			if (a[i] < small) {
				small = a[i];
			}
		}
		float sum = 0, count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == large || a[i] == small) {
				System.out.println(a[i]);
				sum = sum + a[i];
				count++;
			}
		}
		System.out.println(sum / count);
	}
}
