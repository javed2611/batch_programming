package arrayprogramming;
import java.util.Scanner;
public class P34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int outer = sc.nextInt();
		int[][] a = new int[outer][outer];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int x = sc.nextInt();
		int sumRC = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (x == a[i][j]) {
					sumRC = i + j;
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (sumRC % 2 == 0 && a[i][j] % 2 == 0) {
					sum = sum + sumOfDigits(a[i][j]);
				} else if (sumRC % 2 != 0 && a[i][j] % 2 != 0) {
					sum = sum + sumOfDigits(a[i][j]);
				}
			}
		}
		System.out.println(sum);
	}
	public static int sumOfDigits(int n) {
		int sum = 0;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + digit;
			n = n / 10;
		}
		return sum;
	}
}