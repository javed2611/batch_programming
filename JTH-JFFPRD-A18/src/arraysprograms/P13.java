package arraysprograms;

public class P13 {
	public static void main(String[] args) {
		int[] a = { 71, 4, 21, 71, 5, 41 };
		int large = 0;
		int slarge = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > large) {
				slarge = large;
				large = a[i];
			} else if (a[i] != large && a[i] > slarge) {
				slarge = a[i];
			}
		}
		System.out.println("largest " + large);
		System.out.println("Second largest " + slarge);
	}
}
