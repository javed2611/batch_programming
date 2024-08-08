package arrayprogramming;

public class P21 {
	public static void main(String[] args) {
		int[] a = { 15, 23, 4, 1, 10 };
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j = i;
			while (j > 0 && a[j - 1] > temp) {
				a[j] = a[j - 1];
				j--;
			}
			a[j] = temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
