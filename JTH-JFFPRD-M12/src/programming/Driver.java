package programming;

public class Driver {
	public static void demo(int n) {
		if (n <= 5) {
			System.out.println(n);
			n++;
			demo(n);
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Main Starts");
		demo(1);
		System.out.println("Main Ends");
	}
}
