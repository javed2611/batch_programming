// WAP to check if both the strings are anagram or not.
package stringprograms;
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
			if (Arrays.equals(c1, c2)) {
				System.out.println("ANAGRAM");
			} else {
				System.out.println("NOT AN ANAGRAM");
			}
		} else {
			System.out.println("Not an anagram");
		}
	}
}
