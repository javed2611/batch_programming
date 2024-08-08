package stringprograms;
import java.util.*;
public class P12 {
	public static void main(String[] args) {
		Map<Character, Integer> roman = new HashMap<>();
		roman.put('I', 1);
		roman.put('V', 5);
		roman.put('X', 10);
		roman.put('L', 50);
		roman.put('C', 100);
		roman.put('D', 500);
		roman.put('M', 1000);
		String s = "CC";
		s = s.replace("IV", "IIII");
		s = s.replace("IX", "VIIII");
		s = s.replace("XL", "XXXX");
		s = s.replace("XC", "LXXXX");
		s = s.replace("CD", "CCCC");
		s = s.replace("CM", "DCCCC");
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			sum = sum + roman.get(ch);
		}
		System.out.println(sum);
	}
}
