// WAP to print all the digits of a number which are prime.
package basicprogramming;
public class P7 {
	public static boolean isPrime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		return count == 2;
	}
	public static void main(String[] args) {
		int n = 5683;
		while (n != 0) {
			int digit = n % 10;
			if (isPrime(digit)) {
				System.out.println(digit);
			}
			n = n / 10;
		}
	}
}
