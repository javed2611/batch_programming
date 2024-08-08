package stringprogramming;

public class P24 {
	public static void main(String[] args) {
		String[] s = { "samosa", "chai", "Vadapav", "jalebi", "coffee", "misalpav" };
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].compareToIgnoreCase(s[j]) > 0) {
					String temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}
}
