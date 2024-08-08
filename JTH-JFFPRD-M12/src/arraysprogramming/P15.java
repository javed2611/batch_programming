package arraysprogramming;

public class P15 {
	public static void main(String[] args) {
		int[] a = { 1, 4, 3, 2 };
		int large = Integer.MIN_VALUE;
		int small = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > large) {
				large = a[i];
			}
			if (a[i] < small) {
				small = a[i];
			}
		}
		double sum = 0.0, count = 0.0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == large || a[i] == small) {
				sum = sum + a[i];
				count++;
			}
		}
		System.out.println(sum / count);
	}
}
