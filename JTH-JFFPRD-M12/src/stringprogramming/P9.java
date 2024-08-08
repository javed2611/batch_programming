package stringprogramming;
import java.util.Scanner;
public class P9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		boolean isUppercase = false, isLowerCase = false, 
				isNumeric = false, isSpecial = false;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				isUppercase = true;
			} else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				isLowerCase = true;
			} else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				isNumeric = true;
			} else {
				isSpecial = true;
			}
		}
		if (s.length() >= 8 && isUppercase && isLowerCase &&
				isNumeric && isSpecial)
		{
			System.out.println("Strong Password");
		} else {
			System.out.println("Weak Password");
		}
	}
}
