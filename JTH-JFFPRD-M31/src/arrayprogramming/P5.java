// WAP to take the input from the user for an array and print sum of all
// the even numbers in the array.
package arrayprogramming;

import java.util.Scanner;

public class P5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				sum = sum + a[i];
			}
		}
		System.out.println(sum);
	}
}
