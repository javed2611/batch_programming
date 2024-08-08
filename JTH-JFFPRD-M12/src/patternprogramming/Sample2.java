package patternprogramming;

import java.util.Scanner;

public class Sample2 {
	public static void main(String[] args) throws InterruptedException {
		int r, c, row;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of rows = ");
		row = sc.nextInt();
		for (r = row / 2; r <= row; r += 2) {
			for (c = 1; c < row - r; c += 2) {
				System.out.print(" ");
			}
			for (c = 1; c <= r; c++) {
				System.out.print(r);
				Thread.sleep(100);
			}
			for (c = 1; c <= row - r; c++) {
				System.out.print(" ");
			}
			for (c = 1; c <= r; c++) {
				System.out.print(r);
				Thread.sleep(100);
			}
			System.out.println("");
		}

		for (r = row; r >= 1; r--) {
			for (c = r; c < row; c++) {
				System.out.print(" ");
			}

			for (c = 1; c <= (r * 2) - 1; c++) {
				System.out.print(r);
				Thread.sleep(100);
			}

			System.out.println("");
		}

	}
}