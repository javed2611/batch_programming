// WAP to check if the string password is a Strong password
// or weak password.
package stringsprograms;

public class P10 {
	public static void main(String[] args) {
		String password = "Pa1#";
		boolean isUpper = false, isLower = false,
				isNumeric = false, isSpecial = false;
		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				isUpper = true;
			} else if (c >= 'a' && c <= 'z') {
				isLower = true;
			} else if (c >= '0' && c <= '9') {
				isNumeric = true;
			} else {
				isSpecial = true;
			}
		}
		if (password.length() >= 8 && isUpper && isLower &&
			isNumeric && isSpecial)
		{
			System.out.println("Strong Password");
		} else {
			System.out.println("Weak Password");
		}
	}
}
