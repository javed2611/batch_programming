package basicprogramming;

import java.util.Scanner;

public class P25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		while (n != 0) {
			int digit = n % 10;
			if (digit % 2 != 0) {
				sum = sum + digit;
			}
			n = n / 10;
		}
		System.out.println(sum);
	}
}
