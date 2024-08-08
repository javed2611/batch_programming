// WAP to find the product of sum of all even digits and sum of all odd digit.
package basicprogramming;
public class P14 {
	public static void main(String[] args) {
		int n = 257859;
		int even = 0, odd = 0;
		while (n != 0) {
			int digit = n % 10;
			if (digit % 2 == 0) {
				even = even  + digit;
			} else {
				odd = odd + digit;
			}
			n = n /10;
		}
		System.out.println(even * odd);
	}
}