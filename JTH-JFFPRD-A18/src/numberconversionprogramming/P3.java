// Binary into Decimal
package numberconversionprogramming;
public class P3 {
	public static void main(String[] args) {
		int n = 13;
		int sum = 0, p = 1, base = 8;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + digit * p;
			n = n / 10;
			p = p * base;
		}
		System.out.println(sum);
	}
}
