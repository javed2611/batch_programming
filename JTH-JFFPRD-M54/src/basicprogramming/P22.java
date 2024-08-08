// WAP to check if the number is a palindrome number or not
package basicprogramming;

public class P22 {
	public static void main(String[] args) {
		int n = 121;
		int reverse = 0, temp = n;
		while (n != 0) {
			int digit = n % 10;
			reverse = reverse * 10 + digit;
			n = n / 10;
		}
		if (temp == reverse) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}
}
