package arraysprogramming;

public class P8 {
	public static void main(String[] args) {
		int n = 89;
		int sum = 0;
		while (n != 0 || sum > 9) {
			if (n == 0) {
				n = sum;
				sum = 0;
			}
			int digit = n % 10;
			sum = sum + digit;
			n = n / 10;
		}
		System.out.println(sum);
	}
}
