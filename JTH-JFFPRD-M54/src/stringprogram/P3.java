// WAP to check if the string is a Palindrome or not.
// Eg - mam -> mam nitin -> nitin level -> level
package stringprogram;
public class P3 {
	public static void main(String[] args) {
		String s = "levEl";
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		if (s.equalsIgnoreCase(reverse)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}
}
