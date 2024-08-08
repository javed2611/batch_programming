package arrayprogramming;

public class P8 {
	public static void main(String[] args) {
		int[] a = { 4, 7, 11, 5, 11, 8 };
		int large = a[0], slarge = a[1];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > large) {
				slarge = large;
				large = a[i];
			} else if (a[i] > slarge && a[i] != large) {
				slarge = a[i];
			}
		}
		System.out.println("Largest " + large);
		System.out.println("Second Largest " + slarge);
	}
}
