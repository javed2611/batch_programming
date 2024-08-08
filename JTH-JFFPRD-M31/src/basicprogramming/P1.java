package basicprogramming;
public class P1 {
	public static void demo(int n) {
		if (n > 0) {
			System.out.print(n + " ");
			demo(n - 5);
		}
		System.out.print(n + " ");
	}
	public static void main(String[] args) {
		demo(16);
		System.out.println();
		demo(10);
		System.out.println();
		demo(19);
	}
}
