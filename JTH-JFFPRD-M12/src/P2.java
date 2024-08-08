import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int leftSum = 0, rightSum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == j) {
					leftSum = leftSum + a[i][j];
				}
				if (i + j == n - 1) {
					rightSum = rightSum + a[i][j];
				}
			}
		}
		int diff = leftSum - rightSum;
		System.out.println(diff < 0 ? diff * -1 : diff);
	}
}
