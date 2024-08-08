package arraysprograms;

public class P29 {
	public static void main(String[] args) {
		int n = 109;
		if (n == 0) {
			System.out.println(0);
		} else if (n % 9 == 0) {
			System.out.println(9);
		} else {
			System.out.println(n % 9);
		}
	}
}
