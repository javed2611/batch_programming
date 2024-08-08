// WAP to count the number of 1 bits present in the binary representation
// of the decimal value.
package numberprogramming;
public class P2 {
	public static void main(String[] args) {
		int n = 15;
		int count = 0;
		while (n != 0) {
			int rem = n % 2;
			if (rem == 1) {
				count++;
			}
			n = n / 2;
		}
		System.out.println(count);
	}
}
