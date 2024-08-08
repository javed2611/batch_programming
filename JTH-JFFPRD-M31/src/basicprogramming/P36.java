// WAP to check if the number is a Armstrong Number or not.
package basicprogramming;
public class P36 {
	public static void main(String[] args) {
		int n = 153;
		int sum = 0, temp = n;
		int p = countDigits(n);
		while (n != 0) {
			int digit = n % 10;
			sum = sum + pow(digit, p);
			n = n / 10;
		}
		if (sum == temp) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not an Armstrong Number");
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
