// WAP to convert decimal into binary
package basicprogramming;

public class P41 {
	public static void main(String[] args) {
		int n = 19;
		String bin = "";
		while (n != 0) {
			int rem = n % 2;
			bin  = rem + bin;
			n = n / 2;
		}
		System.out.println(bin);
	}
}
