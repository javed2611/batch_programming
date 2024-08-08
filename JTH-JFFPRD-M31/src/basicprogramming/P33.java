package basicprogramming;
public class P33 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100000; i++) {
			StrongNumber(i);
		}
	}
	public static void StrongNumber(int n) {
		int temp = n;
		int sum = 0;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + factorial(digit);
			n = n / 10;
		}
		if (sum == temp) {
			System.out.println(temp);
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
