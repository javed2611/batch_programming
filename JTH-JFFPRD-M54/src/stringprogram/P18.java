package stringprogram;
import java.util.LinkedHashMap;
import java.util.Map;
public class P18 {
	public static void main(String[] args) {
		String s = "maharashtra";
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (map.containsKey(ch)) {
				int value = map.get(ch);
				map.put(ch, value + 1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}
}
