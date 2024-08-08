package programming;

public class Driver1 {
	public static void test(int n) {
		if (n > 0) {
			System.out.println(n);
			test(n-5);
		}
		System.out.println(n);
	}
	public static void main(String[] args) {
		test(16);
	}
}
