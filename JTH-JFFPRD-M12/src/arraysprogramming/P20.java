package arraysprogramming;

public class P20 {
	public static void main(String[] args) {
		int[] a = { 9, -3, 8, -6, -7, 8, 10 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
