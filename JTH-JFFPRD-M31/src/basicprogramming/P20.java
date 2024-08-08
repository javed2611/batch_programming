// WAP to separate each digit from the number.
package basicprogramming;

public class P20 {
	public static void main(String[] args) {
		int n = 8324;
		while (n != 0) {
			int digit = n % 10;
			System.out.println(digit);
			n = n / 10;
		}
	}
}
