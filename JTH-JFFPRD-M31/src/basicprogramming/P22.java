// WAP to display all the odd digit from the number.
package basicprogramming;

import java.util.Scanner;

public class P22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n != 0) {
			int digit = n % 10;
			if (digit % 2 != 0) {
				System.out.println(digit);
			}
			n = n / 10;
		}
	}
}
