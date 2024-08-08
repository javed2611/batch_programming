// WAP to find the gcd of two numbers.
package basicprogramming;

public class P13 {
	public static void main(String[] args) {
		int a = 9, b = 18;
		int gcd = 1;
		for(int i = 1; i <= a && i<=b; i++) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
	}
}
