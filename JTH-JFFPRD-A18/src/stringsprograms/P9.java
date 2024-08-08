package stringsprograms;

public class P9 {
	public static void main(String[] args) {
		String s = "ApPLe";
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'a' && c <= 'z') {
				res = res + (char) (c - 32);
			} else if (c >= 'A' && c <= 'Z') {
				res = res + (char) (c + 32);
			} else {
				res = res + c;
			}
		}
		System.out.println(res);
	}
}
