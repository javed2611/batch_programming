// WAP to check if the string password is strong or not.
package stringprogram;
public class P10 {
	public static void main(String[] args) {
		String s = "Jspiders@1";
		if (s.length() >= 8) {
			boolean isUpper = false, isLower = false, isDigit = false, 
					isSpecial = false;
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if (ch >= 'A' && ch <= 'Z') {
					isUpper = true;
				} else if (ch >= 'a' && ch <= 'z') {
					isLower = true;
				} else if (ch >= '0' && ch <= '9') {
					isDigit = true;
				} else {
					isSpecial = true;
				}
			}
			if (isUpper && isLower && isDigit && isSpecial) {
				System.out.println("Strong Password");
			} else {
				System.out.println("Not a Strong Password");
			}

		} else {
			System.out.println("Not a Strong Password");
		}
	}
}
