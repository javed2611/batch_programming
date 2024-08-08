// WAP to print all the elements of 2D array by taking input from user.
package arrayprogram;
import java.util.Scanner;
public class P18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of 2D array");
		int outer = sc.nextInt();
		System.out.println("Enter the size of 1D array");
		int inner = sc.nextInt();
		int[][] a = new int[outer][inner];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("Enter the element "
						+ "for index " + i + " " + j);
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}

	}
}
