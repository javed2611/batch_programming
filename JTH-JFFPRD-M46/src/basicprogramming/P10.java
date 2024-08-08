// WAP to print all the digits of a number.
package basicprogramming;

public class P10 {
	public static void main(String[] args) {
		int n = 987;
		while (n != 0) {
			int digit = n % 10;
			System.out.println(digit);
			n = n / 10;
		}
	}
}
