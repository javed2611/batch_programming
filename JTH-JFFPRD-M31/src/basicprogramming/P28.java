// WAP to check if the number is a Special Number or not.
package basicprogramming;

import java.util.Scanner;

public class P28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0, product = 1, temp = n;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + digit;
			product = product * digit;
			n = n / 10;
		}
		int res = sum + product;
		if (res == temp) {
			System.out.println("Special Number");
		} else {
			System.out.println("not a Special Number");
		}
	}
}
