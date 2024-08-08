package stringprogram;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class P11 {
	public static void main(String[] args) {
		String s = "elephant";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				int count = map.get(c);
				map.put(c, count + 1);
			} else {
				map.put(c, 1);
			}
		}
		for (Entry<Character, Integer> e : map.entrySet()) {
			System.out.print(e.getKey() + "" + e.getValue() + " ");
		}
	}
}
