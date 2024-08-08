package stringprogram;
public class P11 {
	public static void main(String[] args) {
		String s = "MU1M2B3A4I";
		String op = "";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				op = op + s.charAt(i);
			} else {
				sum = sum + (s.charAt(i) - '0');
			}
		}
		System.out.println(op.length() + op + sum);
	}
}
