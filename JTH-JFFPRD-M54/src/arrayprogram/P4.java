// Product of all odd elements in array
package arrayprogram;

import java.util.Scanner;

public class P4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt(); // Size for the array
		int[] a = new int[n];
		int prod = 1;
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the value for index " + i);
			a[i] = sc.nextInt();
			
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				prod = prod * a[i];
			}
		}
		System.out.println(prod);
	}
}
