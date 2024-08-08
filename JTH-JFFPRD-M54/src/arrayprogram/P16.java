package arrayprogram;
public class P16 {
	public static void main(String[] args) {
		int[] a = { 3, 77, 343, 456 };
		int k = 3;
		int maxCount = 0;
		int res = 0;
		for (int i = 0; i < a.length; i++) {
			int count = countDigitK(a[i], k);
			if (count > maxCount) {
				maxCount = count;
				res = a[i];
			}
		}
		System.out.println(res);
	}
	public static int countDigitK(int n, int k) {
		int count = 0;
		while (n != 0) {
			int digit = n % 10;
			if (digit == k) {
				count++;
			}
			n = n / 10;
		}
		return count;
	}
}
