// WAP to check if the number is perfect number or not.
package basicprogramming;
public class P15 {
	public static void main(String[] args) {
		int n = 28;
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == n) {
			System.out.println("It is a Perfect Number");
		} else {
			System.out.println("It is not a Perfect Number");
		}
	}
}
