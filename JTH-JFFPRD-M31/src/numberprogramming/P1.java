// Decimal into Binary
package numberprogramming;

public class P1 {
	public static void main(String[] args) {
		int n = 25;
		String bin = "";
		while (n != 0) {
			int rem = n % 2;
			bin = rem + bin;
			n = n / 2;
		}
		System.out.println(bin);
	}
}
