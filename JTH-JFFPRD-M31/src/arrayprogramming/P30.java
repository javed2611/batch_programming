package arrayprogramming;
import java.util.Scanner;
public class P30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter outer array size");
		int outer = sc.nextInt();
		System.out.println("Enter inner array size");
		int inner = sc.nextInt();
		int[][] a = new int[outer][inner];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the elements for i " + i);
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("Enter the elements for j " + j);
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
