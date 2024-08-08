package arraysprogramming;

public class P18 {
	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 4, 2 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		int avg = sum / a.length;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == avg) {
				count++;
			}
		}
		System.out.println(count);
	}
}
