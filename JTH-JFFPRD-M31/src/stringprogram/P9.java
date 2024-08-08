// WAP to check if the password is valid or not
// 1. length should be 8 or more.
// 2. must contain atleast one uppercase
// 3. must contain atleast one lowercase
// 4. must contain atleast one number
// 5. must contain atleast one special character.
// 6. should not consist of any space.
package stringprogram;
public class P9 {
	public static void main(String[] args) {
		String password = "Ja@123";
		if (passwordValidation(password)) {
		System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}
	public static boolean passwordValidation(String password) {
		if (password.length() < 8) {
			return false;
		}
		boolean upper = false, lower = false, number = false, special = false;
		for (int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);
			if (ch == ' ') {
				return false;
			} else if (ch >= 'A' && ch <= 'Z') {
				upper = true;
			} else if (ch >= 'a' && ch <= 'z') {
				lower = true;
			} else if (ch >= '0' && ch <= '9') {
				number = true;
			} else {
				special = true;
			}
		}
		if (upper && lower && number && special) {
			return true;
		} else {
			return false;
		}
	}
}
