// WAP to find the occurrence of each character in the string.
package stringprogramming;
public class P12 {
	public static void main(String[] args) {
		String s = "maharashtra";
		boolean[] b = new boolean[s.length()];
		for (int i = 0; i < s.length(); i++) {
			if (b[i] == false) {
				int count = 1;
				for (int j = i + 1; j < s.length(); j++) {
					if (s.charAt(i) == s.charAt(j)) {
						count++;
						b[j] = true;
					}
				}
				if (count > 1) {
					System.out.println(s.charAt(i) + " " + count);
				}
			}
		}
	}
}
