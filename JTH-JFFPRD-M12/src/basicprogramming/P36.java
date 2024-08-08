// WAP to check if the number is armstrong number
package basicprogramming;
public class P36 {
	public static void main(String[] args) {
		int n = 153;
		int temp = n, sum = 0;
		int p = countOfDigits(n);
		while (n != 0) {
			int digit = n % 10;
			sum = sum + pow(digit, p);
			n = n / 10;
		}

		if (temp == sum) {
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

	public static int countOfDigits(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n = n / 10;
		}
		return count;
	}
}
