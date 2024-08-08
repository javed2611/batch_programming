package arraysprogramming;

import java.util.Scanner;

public class P28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the outer array size");
		int outer = sc.nextInt();
		System.out.println("Enter the inner array size");
		int inner = sc.nextInt();
		int[][] a = new int[outer][inner];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("Enter the element");
				a[i][j] = sc.nextInt();
			}
		}
		//to print the array
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
	}
}




