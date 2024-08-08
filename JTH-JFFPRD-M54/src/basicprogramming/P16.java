// WAP to check if the number is a Niven Number(Harshad's Number) or not.
// A Harshad Number is a number which is divisible by sum of its digits.
package basicprogramming;

import java.util.Scanner;

public class P16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		int n = sc.nextInt();
		int sum = 0, temp = n;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + digit;
			n = n / 10;
		}
		if (temp % sum == 0) {
			System.out.println("Harshad Number");
		} else {
			System.out.println("Not a Harshad Number");
		}
	}
}
