// WAP to convert binary into decimal
package basicprogramming;

public class P43 {
	public static void main(String[] args) {
		int n = 1010;
		int base = 1;
		int sum = 0;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + digit * base;
			base  = base * 2;
			n = n / 10;
		}
		System.out.println(sum);
	}
}
