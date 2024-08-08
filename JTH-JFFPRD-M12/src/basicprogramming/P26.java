// WAP to print all the special number in the range 1-100
package basicprogramming;

public class P26 {
	public static void main(String[] args) {
		for (int n = 1; n <= 100; n++) {
			int temp = n;
			int sum = 0, product = 1;
			while (temp != 0) {
				int digit = temp % 10;
				sum = sum + digit;
				product = product * digit;
				temp = temp / 10;
			}
			if (sum + product == n) {
				System.out.println(n);
			}
		}
	}
}
