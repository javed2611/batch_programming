// Anagram
package stringprogram;
import java.util.Arrays;
public class P18 {
	public static void main(String[] args) {
		String s1 = "cat";
		String s2 = "act";
		if (s1.length() == s2.length()) {
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			boolean isAnagram = true;
			for (int i = 0; i < c2.length; i++) {
				if (c1[i] != c2[i]) {
					isAnagram = false;
					break;
				}
			}
			if (isAnagram) {
				System.out.println("Anagram");
			} else {
				System.out.println("not an Anagram");
			}

		} else {
			System.out.println("Length not same Not an Anagram");
		}
	}
}
