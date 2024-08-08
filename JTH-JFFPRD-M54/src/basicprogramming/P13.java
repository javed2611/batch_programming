// WAP to find the sum of all the digit in the number.
package basicprogramming;

public class P13 {
	public static void main(String[] args) {
		int n = 1684;
		int sum = 0;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + digit;
			n = n / 10;
		}
		System.out.println(sum);
	}
}
