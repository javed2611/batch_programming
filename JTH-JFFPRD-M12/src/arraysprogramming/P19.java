package arraysprogramming;

import java.util.Arrays;

public class P19 {
	public static void main(String[] args) {
		int[] a = { 41,21,51,11,31};
		Arrays.sort(a);
		int x = 21;
		int sp = 0, ep = a.length - 1;
		int mp = (sp + ep) / 2;
		while (sp <= ep) {
			if (x == a[mp]) {
				System.out.println("the element is present at " + mp);
				break;
			} else if (x > a[mp]) {
				sp = mp + 1;
			} else if (x < a[mp]) {
				ep = mp - 1;
			}
			mp = (sp + ep) / 2;
		}
		if (sp > ep) {
			System.out.println("The element is not present");
		}
	}
}
