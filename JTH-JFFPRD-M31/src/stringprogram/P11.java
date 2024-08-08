package stringprogram;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class P11 {
	public static void main(String[] args) {
		String s = "maharashtra";
		Map<Character, Integer> m = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (m.containsKey(ch)) {
				int count = m.get(ch);
				m.put(ch, count + 1);
			} else {
				m.put(ch, 1);
			}
		}
		Set set = m.entrySet();
		for (Object obj : set) {
			System.out.println(obj);
		}
	}
}
