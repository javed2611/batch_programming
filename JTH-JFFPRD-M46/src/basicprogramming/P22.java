// WAP to count the number of digits present in the input.
package basicprogramming;

public class P22 {
	public static void main(String[] args) {
		int n = 74156;
		int count = 0;
		while (n != 0) {
			count++;
			n = n / 10;
		}
		System.out.println(count);
	}
}
