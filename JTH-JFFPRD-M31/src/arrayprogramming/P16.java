package arrayprogramming;
import java.util.Arrays;
public class P16 {
	public static void main(String[] args) {
		int[] a = { 0, 4, 0, 0, 1, 3, 4, 1, 0, 2 };
		int[] b = a.clone();
		Arrays.sort(a);
		int good = 0, bad = 0;
		for (int i = 0; i < b.length; i++) {
			if (a[i] == b[i]) {
				good = good + a[i];
			} else {
				bad = bad + a[i];
			}
		}
		System.out.println(good - bad);
	}
}
