
public class P7 {
	public static void test(int n) {
		if (n >= 1) {
			System.out.println(n);
			test(--n);
		}
	}
	public static void main(String[] args) {
		test(5);
	}
}
