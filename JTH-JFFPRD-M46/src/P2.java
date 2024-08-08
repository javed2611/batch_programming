
public class P2 {
	public static void main(String[] args) {
		demo(5);
	}
	public static void demo(int i) {
		if (i>=1) {
			System.out.println(i);
			i--;
			demo(i);
		}
	}
}
