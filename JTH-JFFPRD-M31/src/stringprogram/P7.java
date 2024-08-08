//WAP to convert all the lowercase characters into uppercase.
package stringprogram;

public class P7 {
	public static void main(String[] args) {
		String s = "Happy holi 123";
		char[] a = s.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 'a' && a[i] <= 'z') {
				a[i] = (char) (a[i] - 32);
			}
		}
		String output = new String(a);
		System.out.println(output);
	}
}
