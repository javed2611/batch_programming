// Octal -> Binary
package numberprogramming;

public class P5 {
	public static void main(String[] args) {
		int n = 16;
		int sum = 0, power = 0;
		// Octal to Decimal
		while (n != 0) {
			int digit = n % 10;
			sum = sum + digit * pow(8, power);
			power++;
			n = n / 10;
		}
		// Decimal to Binary
		String bin = "";
		while (sum != 0) {
			int rem = sum % 2;
			bin = rem + bin;
			sum = sum / 2;
		}
		System.out.println(bin);
	}

	public static int pow(int n, int p) {
		int res = 1;
		for (int i = 1; i <= p; i++) {
			res = res * n;
		}
		return res;
	}
}
