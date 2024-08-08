// WAP to print the nth fibonacci number.
package basicprogramming;

import java.util.Scanner;

public class P16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = sc.nextInt();
		int a = 0, b = 1;
		int c = 0;
		if (n == 1) {
			System.out.println(0);
		} else if (n == 2) {
			System.out.println(1);
		} else {
			for (int i = 1; i <= n - 2; i++) {
				c = a + b;
				a = b;
				b = c;
			}
			System.out.println(c);
		}
	}
}
