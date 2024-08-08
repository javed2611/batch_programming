// WAP to find the single digit sum of a number.
package basicprogramming;

public class P37 {
	public static void main(String[] args) {
		int n = 58;
		if (n == 0) {
			System.out.println(0);
		} else if (n % 9 == 0) {
			System.out.println(9);
		} else {
			System.out.println(n % 9);
		}
	}
}
