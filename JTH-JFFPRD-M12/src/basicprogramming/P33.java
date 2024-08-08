// WAP to check if the number is happy number or not.
package basicprogramming;
public class P33 {
	public static void main(String[] args) {
		int n = 27;
		while (n != 1 && n != 4) {
			n = sumOfSquareOfDigits(n);
		}
		if (n == 1) {
			System.out.println("Happy Number");
		} else if (n == 4) {
			System.out.println("Not a Happy Number");
		}
	}
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
