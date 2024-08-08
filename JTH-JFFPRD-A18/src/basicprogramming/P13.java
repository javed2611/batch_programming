// WAP to check if the number is ArmStrong Number.
package basicprogramming;

public class P13 {
	public static void main(String[] args) {
		int n = 153;
		int temp = n, sum = 0;
		int power = countDigits(n);
		while (n != 0) {
			int digit = n % 10;
			sum = sum + pow(digit, power);
			n = n / 10;
		}
		if (sum == temp) {
			System.out.println("ArmStrong Number");
		} else {
			System.out.println("Not an ArmStrong Number");
		}
	}
	public static int pow(int n, int p) {
		int result = 1;
		for (int i = 1; i <= p; i++) {
			result = result * n;
		}
		return result;
	}
	public static int countDigits(int n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		return count;
	}
}
