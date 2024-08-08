package stringprogramming;
import java.util.HashSet;
public class P16 {
	public static void main(String[] args) {
		String s = "Cozy sphinx waves quart jug of bad milk.";
		s = s.toLowerCase();
		HashSet<Character> h = new HashSet<>();
		for(int i = 0;i<s.length();i++)
		{
			if (s.charAt(i)>='a' && s.charAt(i)<='z') {
				h.add(s.charAt(i));
			}
		}
		if (h.size() == 26) {
			System.out.println("Pangram");
		} else {
			System.out.println("Not a Pangram");
		}
	}
}
