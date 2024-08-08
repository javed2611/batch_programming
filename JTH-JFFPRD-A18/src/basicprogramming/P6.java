// WAP to print all the Niven number from 1-100.
package basicprogramming;

public class P6 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			int n = i;
			int temp = n;
			int sum = 0;
			while (n != 0) {
				int digit = n % 10;
				sum = sum + digit;
				n = n / 10;
			}
			if (temp % sum == 0) {
				System.out.println(sum);
			}
		}
	}
}
