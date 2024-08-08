// WAP to check if the number is a perfect square.
package basicprogramming;
public class P9 {
	public static void main(String[] args) {
		int n = 14;
		int i = 1;
		for (; i * i <= n; i++) {
			if (i * i == n) {
				System.out.println("It is a Perfect Square");
				break;
			}
		}
		if (i * i > n) {
			System.out.println("It is not a perfect square");
		}
	}
}
