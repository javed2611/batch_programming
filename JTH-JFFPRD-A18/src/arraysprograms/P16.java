// Leader element in the array
package arraysprograms;
public class P16 {
	public static void main(String[] args) {
		int[] a = { 8, 7, 4, 3, 5, 2 };
		for (int i = 0; i < a.length; i++) {
			boolean leader = true;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					leader = false;
					break;
				}
			}
			if (leader) {
				System.out.print(a[i] + " ");
			}
		}
	}
}
