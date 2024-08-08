// WAP to check if the number is a Palindrome Number or not
package basicprogramming;
public class P21 {
	public static void main(String[] args) {
		int n = 1221;
		int rev = 0, temp = n;
		while (n != 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
		}
		if (rev == temp) {
			System.out.println("Palindrome Number");
		} else {
			System.out.println("Not a Palindrome Number");
		}
	}
}
