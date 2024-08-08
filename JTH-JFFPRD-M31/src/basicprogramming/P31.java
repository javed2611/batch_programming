package basicprogramming;
public class P31 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			HarshadNumber(i);
		}
	}
	public static void HarshadNumber(int n) {
		int sum = 0, temp = n;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + digit;
			n = n / 10;
		}
		if (temp % sum == 0) {
			System.out.println(temp);
		}
	}
}
