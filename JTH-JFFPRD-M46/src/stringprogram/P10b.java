package stringprogram;

import java.util.Set;
import java.util.TreeSet;

public class P10b {
	public static void main(String[] args) {
		String s = "The quick brown fox jumps over the lazy dog";
		s = s.toLowerCase();
		Set<Character> set = new TreeSet<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				set.add(s.charAt(i));
			}
		}
		if (set.size() == 26) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
