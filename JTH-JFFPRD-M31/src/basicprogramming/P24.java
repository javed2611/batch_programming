// WAP to find the product of all odd digits from the number
package basicprogramming;

import java.util.Scanner;

public class P24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int product = 1;
		while (n != 0) {
			int digit = n % 10;
			if (digit % 2 != 0) {
				product = product * digit;
			}
			n = n / 10;
		}
		System.out.println(product);
	}
}
