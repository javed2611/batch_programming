package basicprogramming;

public class P26 {
	public static void main(String[] args) {
		int n = 9;
		int sqr = n * n;
		int sum = 0;
		while (sqr != 0) {
			int digit = sqr % 10;
			sum = sum + digit;
			sqr = sqr / 10;
		}
		if (n == sum) {
			System.out.println("Neon Number");
		} else {
			System.out.println("Not a Neon Number");
		}
	}
}
