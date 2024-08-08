// WAP to reverse the string.
package stringprogram;
public class P2 {
	public static void main(String[] args) {
		String s = "i like to eat apple";
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		System.out.println(reverse);
	}
}