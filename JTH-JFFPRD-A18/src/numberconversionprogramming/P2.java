// WAP to convert decimal number into binary and count all 1 bit
// in the number.
package numberconversionprogramming;

public class P2 {
	public static void main(String[] args) {
		int n = 11;
		int count = 0;
		while (n != 0) {
			int rem = n % 2;
			System.out.print(rem);
			n = n / 2;
		}
	}
}
