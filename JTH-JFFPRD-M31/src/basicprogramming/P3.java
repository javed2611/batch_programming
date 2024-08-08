package basicprogramming;

public class P3 {
	public static void main(String[] args) {
		for (int n = 5; n <= 10; n++) {
			int product = 1;
			for (int i = 1; i <= n; i++) {
				product = product * i;
			}
			System.out.println(product);
		}
	}
}
