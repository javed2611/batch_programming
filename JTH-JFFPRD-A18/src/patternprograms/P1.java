package patternprograms;

public class P1 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n; j++) {
				if (i >= j) {
					int x = factorial(i) / (factorial(i - j) * factorial(j));
					System.out.print(x + " ");
				}
			}
			System.out.println();
		}
	}

	public static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
