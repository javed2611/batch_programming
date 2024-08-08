package basicprogramming;

public class P19 {
	public static void main(String[] args) {
		int n = 7891327;
		int largestDigit = 0;
		while (n != 0) {
			int digit = n % 10;
			if (digit > largestDigit) {
				largestDigit = digit;
			}
			n = n / 10;
		}
		System.out.println(largestDigit);
	}
}
