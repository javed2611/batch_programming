// Binary to Decimal;
package numberprogramming;
public class P4 {
	public static void main(String[] args) {
		int n = 16;
		int sum = 0, power = 0;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + digit * pow(8, power);
			power++;
			n = n / 10;
		}
		System.out.println(sum);
	}

	public static int pow(int n, int p) {
		int res = 1;
		for (int i = 1; i <= p; i++) {
			res = res * n;
		}
		return res;
	}
}
