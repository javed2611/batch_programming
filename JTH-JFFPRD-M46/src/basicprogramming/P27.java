package basicprogramming;

public class P27 {
	public static void main(String[] args) {
		int n = 28;
		while (n != 1 && n != 4) {
			n = digitSquareSum(n);
		}
		if (n == 1) {
			System.out.println("Happy Number");
		} else {
			System.out.println("Not a Happy Number");
		}
	}

	public static int digitSquareSum(int n) {
		int sum = 0;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + (digit * digit);
			n = n / 10;
		}
		return sum;
	}
}
