package arraysprogramming;
public class P12 {
	public static void main(String[] args) {
		int[] a = { 4, 1, 5, 2, 3 };
		int x = 2;
		for (int i = 0; i < a.length; i++) {
			if (x == a[i]) {
				System.out.println("The element is present at " + i);
				return;
			}
		}
		System.out.println("The element is not present");
	}
}
