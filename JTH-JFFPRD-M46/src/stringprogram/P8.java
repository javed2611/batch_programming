package stringprogram;

public class P8 {
	public static void main(String[] args) {
		String s = "Hello123@123";
		double upper = 0.0, lower = 0.0, digit = 0.0, special = 0.0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				upper++;
			} else if (ch >= 'a' && ch <= 'z') {
				lower++;
			} else if (ch >= '0' && ch <= '9') {
				digit++;
			} else {
				special++;
			}
		}
		System.out.println("Uppercase letters: " + (upper / s.length()) * 100);
		System.out.println("Lowercase letters:" + (lower / s.length()) * 100);
	}
}
