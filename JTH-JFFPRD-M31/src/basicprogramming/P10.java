// WAP to check if the number is a perfect number or not.
package basicprogramming;

public class P10 {
	public static void main(String[] args) {
		int n = 28;
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (n == sum) {
			System.out.println("Perfect Number");
		} else {
			System.out.println("Not a Perfect Number");
		}
	}
}
