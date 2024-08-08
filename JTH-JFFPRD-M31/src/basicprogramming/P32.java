package basicprogramming;

import java.util.Scanner;

public class P32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), temp = n;
		int sum = 0;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + factorial(digit);
			n = n / 10;
		}
		if (sum == temp) {
			System.out.println("Strong Number");
		} else {
			System.out.println("not a Strong Number");
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
