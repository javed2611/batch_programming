// WAP to check if the number is perfect cube or not
package basicprogramming;

public class P38 {
	public static void main(String[] args) {
		int n = 15;
		int i = 1;
		for (; i * i * i <= n; i++) {
			if (i * i * i == n) {
				System.out.println("It is a perfect cube of " + i);
				break;
			}
		}
		if (i * i * i > n) {
			System.out.println("Not a perfect cube");
		}
	}
}
