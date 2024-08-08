// WAP to display first and last digit of a number.
// Input - 989841
// Output - first digit 9
//			last digit 1
package basicprogramming;

public class P26 {
	public static void main(String[] args) {
		int n = 989841;
		int totaldigits = (int) Math.log10(n);
		int firstdigit = (int) (n / Math.pow(10, totaldigits));
		System.out.println("first digit " + firstdigit);
		System.out.println("last digit " + (n % 10));
	}
}
