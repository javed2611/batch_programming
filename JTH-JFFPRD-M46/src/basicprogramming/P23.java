// WAP to calculate the result for number raised to power.
package basicprogramming;

public class P23 {
	public static void main(String[] args) {
		int n = 8, p = 3;
		int res = 1;
		for (int i = 1; i <= p; i++) {
			res = res * n;
		}
		System.out.println(res);
	}
}
