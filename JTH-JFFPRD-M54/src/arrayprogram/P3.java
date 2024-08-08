// sum of all elements of the array
package arrayprogram;

import java.util.Scanner;

public class P3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt(); // Size for the array
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the value for index " + i);
			a[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);
	}
}
