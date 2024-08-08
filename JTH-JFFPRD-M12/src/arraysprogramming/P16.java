package arraysprogramming;

public class P16 {
	public static void main(String[] args) {
		int[] a = { 1, 1111, 111, 11 };
		int k = 3;
		int maxFreq = 0;
		int max = -1;
		for (int i = 0; i < a.length; i++) {
			int count = countOfK(a[i], k);
			if (count > maxFreq) {
				maxFreq = count;
				max = a[i];
			}
		}
		System.out.println(max);
	}

	public static int countOfK(int n, int k) {
		int count = 0;
		while (n != 0) {
			int d = n % 10;
			if (d == k) {
				count++;
			}
			n = n / 10;
		}
		return count;
	}
}
