// WAP to check if the given string is a Strong Password or not.
package stringprogram;

public class P12 {
	public static void main(String[] args) {
		String s = "aBc#12345";
		if (s.length() >= 8) {
			boolean upper = false, lower = false, digit = false, 
					special = false;
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if (ch >= 'A' && ch <= 'Z') {
					upper = true;
				} else if (ch >= 'a' && ch <= 'z') {
					lower = true;
				} else if (ch >= '0' && ch <= '9') {
					digit = true;
				} else if (ch == ' ') {

				} else {
					special = true;
				}
			}
			if (upper && lower && digit && special) {
				System.out.println("Strong Password");
			} else {
				System.out.println("Not a Strong Password");
			}
		} else {
			System.out.println("Password is not Strong");
		}
	}
}
