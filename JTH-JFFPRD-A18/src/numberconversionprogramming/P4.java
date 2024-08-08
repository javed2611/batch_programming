// Octal into BInary
package numberconversionprogramming;

public class P4 {
	public static void main(String[] args) {
		int n = 13;
		int sum = 0, p = 1, base = 8;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + digit * p;
			n = n / 10;
			p = p * base;
		}
		String bin = "";
		while (sum != 0) {
			int rem = sum % 2;
			bin = rem + bin;
			sum = sum / 2;
		}
		System.out.println(bin);
	}
}
