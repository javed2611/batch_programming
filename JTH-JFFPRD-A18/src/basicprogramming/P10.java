// WAP to count total number of squares and cubes in the 
// range 1 - n.
package basicprogramming;
import java.util.Scanner;
public class P10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (isPerfectSquare(i) || isPerfectCube(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println(count);
	}

	public static boolean isPerfectCube(int n) {
		for (int i = 1; i * i * i <= n; i++) {
			if (i * i * i == n) {
				return true;
			}
		}
		return false;
	}

	public static boolean isPerfectSquare(int n) {
		for (int i = 1; i * i <= n; i++) {
			if (i * i == n) {
				return true;
			}
		}
		return false;
	}
}
