package basicprogramming;

import java.util.Scanner;

public class P30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0,temp = n;
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
