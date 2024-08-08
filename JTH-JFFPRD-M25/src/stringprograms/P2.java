// WAP to check if the string is panagram
package stringprograms;

import java.util.Set;
import java.util.TreeSet;

public class P2 {
	public static void main(String[] args) {
		String s = "Glib jocks 1233 quiz nymph to vex dwarf.";
		Set<Character> a = new TreeSet<>();
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				a.add(s.charAt(i));
			}
		}
		if (a.size() == 26) {
			System.out.println("Panagram");
		} else {
			System.out.println("not a Panagram");
		}
	}
}
