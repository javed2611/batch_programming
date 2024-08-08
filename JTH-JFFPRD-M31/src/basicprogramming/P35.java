package basicprogramming;
public class P35 {
	public static void main(String[] args) {
		int n = 16;
		boolean b = false;
		for (int i = 1; i * i <= n; i++) {
			if (i * i == n) {
				b = true;
			}
		}
		if (b) {
			System.out.println("Perfect Square");
		} else {
			System.out.println("Not a Perfect Square");
		}
	}
}
