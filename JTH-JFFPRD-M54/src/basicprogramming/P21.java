// WAP to reverse the number.
package basicprogramming;

public class P21 {
	public static void main(String[] args) {
		int n = 487;
		int reverse = 0;
		while (n != 0) {
			int digit = n % 10;
			reverse = reverse * 10 + digit;
			n = n / 10;
		}
		System.out.println(reverse);
	}
}
