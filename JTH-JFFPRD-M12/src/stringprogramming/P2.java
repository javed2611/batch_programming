// WAP to reverse the string
package stringprogramming;

public class P2 {
	public static void main(String[] args) {
		String s = "java is a programming language";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}
}
