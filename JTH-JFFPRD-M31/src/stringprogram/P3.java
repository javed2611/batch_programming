// WAP to reverse the string.
package stringprogram;
public class P3 {
	public static void main(String[] args) {
		String s = "nikhil";
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		System.out.println(reverse);
	}
}
