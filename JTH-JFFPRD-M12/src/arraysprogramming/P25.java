package arraysprogramming;
public class P25 {
	public static void main(String[] args) {
		int[] a = { 2, 3, 10, 6, 4, 8, 1 };
//		int[] a = { 7, 9, 5, 6, 3, 2 };
		int diff = 0;
		int x = 0, y = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] - a[i] > diff) {
					diff = a[j] - a[i];
					x = a[j];
					y = a[i];
				}
			}
		}
		System.out.println(diff);
		System.out.println(x);
		System.out.println(y);
	}
}
