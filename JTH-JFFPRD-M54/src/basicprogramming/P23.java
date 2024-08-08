// WAP to check if the number is an Armstrong Number or not.
package basicprogramming;

public class P23 {
	public static void main(String[] args) {
		int n = 153;
		int sum = 0, temp = n;
		int countOfDigits = countDigits(n);
		while (n != 0) {
			int digit = n % 10;
			sum = sum + pow(digit, countOfDigits);
			n = n / 10;
		}
		if (sum == temp) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not an Armstrong Number");
		}
	}
	public static int pow(int n, int p) {
		int prod = 1;
		for (int i = 1; i <= p; i++) {
			prod = prod * n;
		}
		return prod;
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
