package basicprogramming;

import java.util.Scanner;

public class P10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		int n = sc.nextInt();
		int count = 0;
//		for (int i = 1; i <= n; i++) {
//			if (n % i == 0) {
//				count++;
//			}
//		}
		int i = 1;
		do{
			if (n % i == 0) {
				count++;
			}
			i++;
		}while (i <= n) ;
		if (count == 2) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not a Prime Number");
		}
	}
}
