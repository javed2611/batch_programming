// WAP to display all the factors of a number.
package basicprogramming;

public class P8 {
	public static void main(String[] args) {
		int n = 9;
		for (int i = 1; i <= n/2; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		System.out.println(n);
	}
}
