package basicprogramming;

public class P40 {
	public static void main(String[] args) {
		int n = 32387634;
		int max = 0;
		while (n != 0) {
			int digit = n % 10;
			if (digit > max) {
				max = digit;
			}
			n = n / 10;
		}
		System.out.println(max);
	}
}
