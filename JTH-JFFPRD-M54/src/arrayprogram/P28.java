package arrayprogram;
public class P28 {
	public static void main(String[] args) {
		int[][] a = { { 11, 22, 33 }, { 44, 55, 66 }, { 77, 88, 99 } };
		int x = 55;
		int sumRC = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == x) {
					sumRC = i + j;
				}
			}
		}
		int sum = 0;
		if (sumRC % 2 == 0) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					if (a[i][j] % 2 == 0) {
						sum = sum + sumOfDigits(a[i][j]);
					}
				}
			}
		} else {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					if (a[i][j] % 2 != 0) {
						sum = sum + sumOfDigits(a[i][j]);
					}
				}
			}
		}
		System.out.println(sum);
	}

	public static int sumOfDigits(int n) {
		int sum = 0;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + digit;
			n = n / 10;
		}
		return sum;
	}
}
