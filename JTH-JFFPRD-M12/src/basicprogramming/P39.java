// WAP to find all the perfect squares and cubes in the range 1 - n
// Note - If a number is both square and cube then it should be considered 
// only once.
package basicprogramming;
public class P39 {
	public static void main(String[] args) {
		int n = 10;
		int square = 0, cube = 0;
		for (int i = 1; i <= n; i++) {
			if (isPerfectSquare(i)) {
				square++;
			} else if (isPerfectCube(i)) {
				cube++;
			}
		}
		System.out.println("Squares are " + square);
		System.out.println("Cubes are " + cube);
	}
	public static boolean isPerfectSquare(int n) {
		int i = 1;
		for (; i * i <= n; i++) {
			if (i * i == n) {
				return true;
			}
		}
		return false;
	}
	public static boolean isPerfectCube(int n) {
		int i = 1;
		for (; i * i * i <= n; i++) {
			if (i * i * i == n) {
				return true;
			}
		}
		return false;
	}
}
