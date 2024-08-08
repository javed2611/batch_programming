// WAP to print the index of a element in the array. If
// the element is not present print -1.
package arraysprograms;
public class P23 {
	public static void main(String[] args) {
		int[] a = { 7, 2, 4, 6, 8 };
		int k = 3;
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == k) {
				index = i;
				break;
			}
		}
		System.out.println(index);
	}
}
