package stringprogram;

public class P23 {
	public static void main(String[] args) {
		String s = "SOSTOT";
		int n = s.length() / 3;
		String original = "SOS".repeat(n);
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (original.charAt(i) != s.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
