package arrayprogramming;

import java.util.Scanner;

public class P31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the outer array");
		int outer = sc.nextInt();
		int[][] a = new int[outer][];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the size of the inner array");
			int inner = sc.nextInt();
			a[i] = new int[inner];
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("Enter the element");
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
	}
}
