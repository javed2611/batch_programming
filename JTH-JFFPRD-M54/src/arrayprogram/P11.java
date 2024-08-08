// WAP to print the index of the element if present in the array 
// or print -1.
// Linear Search / Sequential Search 
package arrayprogram;
public class P11 {
	public static void main(String[] args) {
		int[] a = { 18, 15, 5, 8, 3 };
		int x = 8;
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (x == a[i]) {
				index = i;
				break;
			}
		}
		System.out.println(index);
	}
}
