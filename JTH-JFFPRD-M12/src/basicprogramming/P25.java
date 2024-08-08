// WAP to check if the number is special number or not
package basicprogramming;
public class P25 {
	public static void main(String[] args) {
		int n = 29;
		int temp = n;
		int sum = 0, product = 1;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + digit;
			product = product * digit;
			n = n / 10;
		}
		if (sum + product == temp) {
			System.out.println("It is Special Number");
		} else {
			System.out.println("It is not a Special Number");
		}
	}

}
