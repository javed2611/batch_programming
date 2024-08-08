package arraysprogramming;

public class P4 {
	public static void main(String[] args) {
		int[] a = { 4, 6, 8, 1, 2 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}
	}
}
