// WAP to print the even digits from the number
package basicprogramming;

public class P2 {
	public static void main(String[] args) {
		int n = 98432;
		while (n != 0) {
			int digit = n % 10;
			if (digit % 2 == 0) {
				System.out.println(digit);
			}
			n = n / 10;
		}
	}
}
