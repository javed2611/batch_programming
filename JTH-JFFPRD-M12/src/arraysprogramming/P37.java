package arraysprogramming;
public class P37 {
	public static void main(String[] args) {
		int[][] a = { { 11, 22, 33 }, { 44, 55, 66 }, { 77, 88, 99 } };
		int x = 55;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] == x) {
					sum = i + j;
					break;
				}
			}
		}
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (sum % 2 == 0 && a[i][j] % 2 == 0) {
					total = total + sumOfDigits(a[i][j]);
				} else if (sum % 2 != 0 && a[i][j] % 2 != 0) {
					total = total + sumOfDigits(a[i][j]);
				}
			}
		}
		System.out.println(total);
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
