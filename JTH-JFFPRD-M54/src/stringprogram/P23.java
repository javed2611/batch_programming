// WAP to display all the string values from the array in alphabetical
// order (Lexographical Order)without using sort inbuilt method.
package stringprogram;
public class P23 {
	public static void main(String[] args) {
		String[] a = {"orange","guava","apple","mango","kiwi","grape"};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j].compareTo(a[j + 1]) > 0) {
					String temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (String s : a) {
			System.out.println(s);
		}
	}
}
