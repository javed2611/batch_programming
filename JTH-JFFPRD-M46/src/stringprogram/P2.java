// WAP to reverse the string.
package stringprogram;

public class P2 {
	public static void main(String[] args) {
		String s = "pawan";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}
}
