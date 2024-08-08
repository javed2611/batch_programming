// WAP to print all the odd digits from the number
package basicprogramming;

public class P11 {
	public static void main(String[] args) {
		int n = 5247613;
		while (n != 0) {
			int digit = n % 10;
			if (digit % 2 != 0) {
				System.out.println(digit);
			}
			n = n / 10;
		}
	}
}
