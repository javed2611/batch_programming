package basicprogramming;

public class P20 {
	public static void main(String[] args) {
		int n = 145;
		int sum = 0, temp = n;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + factorial(digit);
			n = n / 10;
		}
		if (sum == temp) {
			System.out.println("Strong Number");
		} else {
			System.out.println("Not a Strong Number");
		}
	}

	public static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
