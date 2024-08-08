package arrayprogramming;
import java.util.Scanner;
public class P32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int days = sc.nextInt();
		int products = sc.nextInt();
		int[][] a = new int[days][products];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < a.length; i++) {
			int large = a[i][0];
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > large) {
					large = a[i][j];
				}
			}
			System.out.print(large + " ");
		}
	}
}
