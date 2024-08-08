
public class P6 {
	public static void test(int n) {
		if (n <= 5) {
			System.out.println(n);
			test(++n); // recursive calling statement
		}
	}
	public static void main(String[] args) {
		System.out.println("Main Starts");
		test(1);
		System.out.println("Main Ends");
	}
}
