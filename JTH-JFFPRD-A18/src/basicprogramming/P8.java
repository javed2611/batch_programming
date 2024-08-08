//  WAP to check if the number is a special number.
package basicprogramming;
public class P8 {
	public static void main(String[] args) {
		int n = 59;
		int temp = n;
		int sum = 0, prod = 1;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + digit;
			prod = prod * digit;
			n = n / 10;
		}
		if (temp == sum + prod) {
			System.out.println("Special Number");
		} else {
			System.out.println("Not a Special Number");
		}
	}
}
