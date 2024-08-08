package basicprogramming;

public class P27 {
	public static void main(String[] args) {
		int n = 21;
		int temp = n;
		int sum = 0;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + digit;
			n = n / 10;
		}
		if (temp % sum == 0) {
			System.out.println("Harshad Number");
		} else {
			System.out.println("Not a Harshad Number");
		}
	}
}
