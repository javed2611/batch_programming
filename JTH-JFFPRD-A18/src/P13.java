// WAP to find sum of all the factors of a number.
public class P13 {
	public static void main(String[] args) {
		int n = 6, sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}
