// WAP to print all the digits of a number.
package basicprogramming;

public class P11 {
	public static void main(String[] args) {
		int n = 1684;

		while (n != 0)
		{
			int digit = n % 10;
			System.out.println(digit);
			n = n / 10;
		}
		
	}
}
