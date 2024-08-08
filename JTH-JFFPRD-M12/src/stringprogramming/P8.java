package stringprogramming;

public class P8 {
	public static void main(String[] args) {
		String s = "BA12NGA3L4ORE";
		String res = "";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				res = res + s.charAt(i);
			} else {
				sum = sum + s.charAt(i) - 48;
			}
		}
		System.out.println(res.length() + res + sum);
	}
}
