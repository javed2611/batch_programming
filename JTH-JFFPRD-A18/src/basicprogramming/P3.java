// WAP to print the sum of all the digit in the number

package basicprogramming;

public class P3 {
	public static void main(String[] args) {
		int n = 9843;
		int sum = 0;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + digit;
			n = n / 10;
		}
		System.out.println(sum);
	}
}
