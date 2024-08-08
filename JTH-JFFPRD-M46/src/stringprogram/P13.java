package stringprogram;

public class P13 {
	public static void main(String[] args) {
		String s = "1MU2M3BA4I";
		String res = "";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				res = res + s.charAt(i);
			} else {
				sum = sum + (s.charAt(i) - '0');
			}
		}
		System.out.println(res.length() + res + sum);
	}
}
