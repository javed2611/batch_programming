package basicprogramming;

public class P28 {
	public static void main(String[] args) {
		for (int n = 1; n <= 100; n++) {
			int temp = n;
			int sum = 0;
			while (temp != 0) {
				int digit = temp % 10;
				sum = sum + digit;
				temp = temp / 10;
			}
			if (n % sum == 0) {
				System.out.println(n);
			}
		}
	}
}
