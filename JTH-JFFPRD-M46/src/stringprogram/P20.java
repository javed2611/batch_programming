package stringprogram;
import java.util.*;
public class P20 {
	public static void main(String[] args) {
		String s = "CDLX";
		s = s.replace("IV", "IIII");
		s = s.replace("IX", "VIIII");
		s = s.replace("XL", "XXXX");
		s = s.replace("XC", "LXXXX");
		s = s.replace("CD", "CCCC");
		s = s.replace("CM", "DCCCC");
		Map<Character, Integer> r = new HashMap<>();
		r.put('I', 1);
		r.put('V', 5);
		r.put('X', 10);
		r.put('L', 50);
		r.put('C', 100);
		r.put('D', 500);
		r.put('M', 1000);
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum = sum + r.get(s.charAt(i));
		}
		System.out.println(sum);
	}
}
