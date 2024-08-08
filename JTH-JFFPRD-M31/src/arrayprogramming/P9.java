package arrayprogramming;

public class P9 {
	public static void main(String[] args) {
		int[] a = { 25, 75, 31, 24 };
		for (int i = 0; i < a.length; i++) {
			int n = a[i];
			int rev = 0;
			while (n != 0) {
				int digit = n % 10;
				rev = rev * 10 + digit;
				n = n / 10;
			}
			System.out.print(rev + " ");
		}
	}
}
