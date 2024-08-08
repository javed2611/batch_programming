// WAP to check if the number is a ArmStrong number or not.
package basicprogramming;
public class P24 {
	public static void main(String[] args) {
		int n = 153;
		int sum = 0, temp = n;
		int digitCount = countDigits(n);
		while (n != 0) {
			int digit = n % 10;
			sum = sum + pow(digit, digitCount);
			n = n / 10;
		}
		if (sum == temp) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("Not a Armstrong number");
		}
	}

	public static int pow(int n, int p) {
		int res = 1;
		for (int i = 1; i <= p; i++) {
			res = res * n;
		}
		return res;
	}

	public static int countDigits(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n = n / 10;
		}
		return count;
	}
}
