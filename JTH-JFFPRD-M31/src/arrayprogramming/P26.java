package arrayprogramming;
import java.util.Arrays;
public class P26 {
	static int[] a = {};
	public static void main(String[] args) {
		System.out.println(Arrays.toString(a));
		addLast(20);
		System.out.println(Arrays.toString(a));
		addLast(30);
		System.out.println(Arrays.toString(a));
		addFirst(15);
		System.out.println(Arrays.toString(a));
		addFirst(10);
		System.out.println(Arrays.toString(a));
		add(18, 2);
		System.out.println(Arrays.toString(a));
		add(4, -7);
		System.out.println(Arrays.toString(a));
	}
	public static void add(int element, int index) {
		if (index < 0 || index > a.length) {
			System.out.println("Invalid Index");
		} else {
			int[] b = new int[a.length + 1];
			b[index] = element;
			for (int i = 0; i < a.length; i++) {
				if (i < index) {
					b[i] = a[i];
				} else {
					b[i + 1] = a[i];
				}
			}
			a = b;
		}
	}

	public static void addLast(int element) {
		int[] b = new int[a.length + 1];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		b[b.length - 1] = element;
		a = b;
	}

	public static void addFirst(int element) {
		int[] b = new int[a.length + 1];
		b[0] = element;
		for (int i = 0; i < a.length; i++) {
			b[i + 1] = a[i];
		}
		a = b;
	}
}
