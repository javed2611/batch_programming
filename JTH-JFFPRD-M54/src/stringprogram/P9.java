package stringprogram;
import java.util.HashSet;
import java.util.Set;
public class P9 {
	public static void main(String[] args) {
		String s = "Sphinx of black quartz, judge my vow.";
		Set<Character> set = new HashSet<>();
		for(int i = 0 ;i<s.length();i++)
		{
			if (Character.isAlphabetic(s.charAt(i))) {
				set.add(s.charAt(i));
			}
		}
		if (set.size() == 26) {
			System.out.println("Pangram");
		} else {
			System.out.println("not a Pangram");
		}
	}
}
