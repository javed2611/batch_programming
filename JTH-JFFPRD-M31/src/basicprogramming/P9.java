// WAP to find the sum of all the factors of a number
package basicprogramming;

import java.util.Scanner;

public class P9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n/2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		sum = sum + n;
		System.out.println(sum);

	}
}
