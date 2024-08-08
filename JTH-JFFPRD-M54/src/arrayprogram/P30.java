package arrayprogram;
public class P30 {
	public static void main(String[] args) {
		int[] a = { 8, 1, 5, 4, 9, 2, 6 };
		int k = 4;
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < k; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = k; i < a.length; i++) {
			for (int j = k; j < a.length - 1; j++) {
				if (a[j] < a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
