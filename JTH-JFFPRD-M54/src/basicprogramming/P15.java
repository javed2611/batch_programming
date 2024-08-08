// WAP to check if the number is a special number or not.
// A number is said to be a Special number if the addition of sum of all digits
// and product of all digits is equal to the number.
package basicprogramming;

import java.util.Scanner;

public class P15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0, product = 1;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + digit;
			product = product * digit;
			n = n / 10;
		}
		if (sum + product == temp) {
			System.out.println("Special Number");
		} else {
			System.out.println("Not a Special Number");
		}
	}
}
