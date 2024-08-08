// WAP to convert octal into binary
package basicprogramming;

public class P44 {
	public static void main(String[] args) {
		int n = 15;
		int sum = 0;
		int base = 1;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + digit * base;
			base = base * 8;
			n = n / 10;
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







