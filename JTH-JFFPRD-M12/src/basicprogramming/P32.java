package basicprogramming;

public class P32 {
	public static void main(String[] args) {
		for (int n = 1; n <= 10000; n++) {
			int sum = 0, temp = n;
			while (temp != 0) {
				int digit = temp % 10;
				int fact = 1;
				for (int i = 1; i <= digit; i++) {
					fact = fact * i;
				}
				sum = sum + fact;
				temp = temp / 10;
			}
			if (n == sum) {
				System.out.println(n);
			}
		}
	}
}
