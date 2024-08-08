// WAP to check if the number is a prime number or not.
package basicprogramming;
public class P11 {
	public static void main(String[] args) {
		int n = 73;
		int count = 2;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not a Prime Number");
		}
	}
}
