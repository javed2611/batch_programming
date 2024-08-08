package stringprogram;

public class P4 {
	public static void main(String[] args) {
		String s = "Madam";
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		if (s.equalsIgnoreCase(reverse)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("not a Palindrome");
		}
	}
}
