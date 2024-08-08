package arraysprograms;

public class P10 {
	public static void main(String[] args) {
		int[] a = { 78, 45, 21, 67, 32 };
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
