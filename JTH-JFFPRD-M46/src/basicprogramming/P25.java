package basicprogramming;

public class P25 {
	public static void main(String[] args) {
		int n = 741;
		int sum = 0, prod = 1;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + digit;
			prod = prod * digit;
			n = n / 10;
		}
		if (sum == prod) {
			System.out.println("Spy Number");
		} else {
			System.out.println("Not a Spy Number");
		}
	}
}
