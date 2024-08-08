// Convert Roman Numerals into Integers
package stringprogramming;
import java.util.HashMap;
public class P14 {
	public static void main(String[] args) {
		String s = "";
		HashMap<Character, Integer> h = new HashMap<>();
		h.put('I', 1);
		h.put('V', 5);
		h.put('X', 10);
		h.put('L', 50);
		h.put('C', 100);
		h.put('D', 500);
		h.put('M', 1000);
		s = s.replace("IV", "IIII");
		s = s.replace("IX", "VIIII");
		s = s.replace("XL", "XXXX");
		s = s.replace("XC", "LXXXX");
		s = s.replace("CD", "CCCC");
		s = s.replace("CM", "DCCCC");
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum = sum + h.get(s.charAt(i));
		}
		System.out.println(sum);
	}
}
