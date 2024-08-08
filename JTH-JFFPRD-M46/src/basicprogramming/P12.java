// WAP to print the sum of all the digits in the number.
package basicprogramming;

public class P12 {
	public static void main(String[] args) {
		int n = 65412;
		int sum = 0;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + digit;
			n = n / 10;
		}
		System.out.println(sum);
	}
}
