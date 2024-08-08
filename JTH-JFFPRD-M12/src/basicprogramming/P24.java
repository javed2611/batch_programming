package basicprogramming;

public class P24 {
	public static void main(String[] args) {
		int n = 578;
		int sum = 0;
		while (n != 0) {
			int digit = n % 10;
			if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
				sum = sum + digit;
			}
			n = n / 10;
		}
		System.out.println(sum);
	}
}
