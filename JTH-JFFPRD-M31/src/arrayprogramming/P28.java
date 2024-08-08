package arrayprogramming;
import java.util.Arrays;
public class P28 {
	static int[] a = { 11, 12, 15, 14 };
	public static void main(String[] args) {
		System.out.println(Arrays.toString(a));
		update(13, 2);
		System.out.println(Arrays.toString(a));
	}
	public static void update(int element, int index) {
		if (index < 0 || index >= a.length) {
			System.out.println("Cannot Update");
		} else {
			a[index] = element;
		}
	}
}
