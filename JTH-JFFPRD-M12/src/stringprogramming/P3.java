// WAP to check if the string is a palindrome or not
package stringprogramming;

public class P3 {
	public static void main(String[] args) {
		String s = "      race car   ";
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				res = res + s.charAt(i);
			}
		}
		String rev = "";
		for (int i = res.length() - 1; i >= 0; i--) {
			rev = rev + res.charAt(i);
		}
		if (res.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}
}
