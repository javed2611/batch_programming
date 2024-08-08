package basicprogramming;

public class P45 {
	public static void main(String[] args) {
		int n = 13;
		int count = 0;
		while (n != 0) {
			int rem = n % 2;
			if (rem == 1) {
				count++;
			}
			n = n / 2;
		}
		System.out.println(count);
	}
}
