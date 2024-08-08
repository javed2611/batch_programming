// WAP to print first 10 fibonacci series numbers.
public class P18 {
	public static void main(String[] args) {
		int a = 0, b = 1;
		int c = 0;
		for (int i = 1; i <= 3; i++) {
			c = a + b;

			a = b;
			b = c;
		}
		System.out.print(c + " ");
	}
}
