package basicprogramming;
public class P29 {
	public static void main(String[] args) {
		int n = 28;
		while (n != 1 && n != 4) {
			n = sumOfSquareOfDigits(n);
		}
		if (n == 1) {
			System.out.println("Happy Number");
		} else {
			System.out.println("Not a Happy Number");
		}
	}
	// This method is used to find the sum of the sqaures of the
	// digits.
	public static int sumOfSquareOfDigits(int n) {
		int sum = 0;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + (digit * digit);
			n = n / 10;
		}
		return sum;
	}
}
