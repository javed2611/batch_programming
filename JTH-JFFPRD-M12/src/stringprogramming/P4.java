// WAP to remove all the spaces from the string.
package stringprogramming;

public class P4 {
	public static void main(String[] args) {
		String s = "r a ce c a r";
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				res = res + s.charAt(i);
			}
		}
		System.out.println(res);
	}
}
