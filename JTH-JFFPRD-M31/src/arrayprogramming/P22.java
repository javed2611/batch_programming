package arrayprogramming;
import java.util.Arrays;
public class P22 {
	public static void main(String[] args) {
		int[] a = { 15, 23, 4, 1, 10 };
		int x = 15;
		Arrays.sort(a);
		int sp = 0, ep = a.length - 1;
		while (sp <= ep) {
			int mp = (sp + ep)/2;
			if (x == a[mp]) {
				System.out.println("Present at " + mp);
				break;
			} else if (x > a[mp]) {
				sp = mp + 1;
			} else if (x < a[mp]) {
				ep = mp - 1;
			}
		}
		if (sp > ep) {
			System.out.println("Not present");
		}
	}
}






