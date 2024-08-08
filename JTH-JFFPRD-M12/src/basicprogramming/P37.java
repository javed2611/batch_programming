// WAP to check if the number is perfect square
package basicprogramming;
public class P37 {
	public static void main(String[] args) {
		int n = 16;
		int i = 1;
		for (; i * i <= n; i++) {
			if (i * i == n) {
				System.out.println("It is a Perfect Square of " + i);
				break;
			}
		}
		if (i * i > n) {
			System.out.println(n + " is not a perfect square");
		}
	}
}
