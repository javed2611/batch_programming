package stringprogram;
public class P21 {
	public static void main(String[] args) {
		String s = "XIX";
		int sum = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			int a = value(s.charAt(i));
			int b = value(s.charAt(i + 1));
			if (a >= b) {
				sum = sum + a;
			} else {
				sum = sum - a;
			}
		}
		sum = sum + value(s.charAt(s.length() - 1));
		System.out.println(sum);
	}
	public static int value(char ch) {
		if (ch == 'I') {
			return 1;
		} else if (ch == 'V') {
			return 5;
		} else if (ch == 'X') {
			return 10;
		} else if (ch == 'L') {
			return 50;
		} else if (ch == 'C') {
			return 100;
		} else if (ch == 'D') {
			return 500;
		} else {
			return 1000;
		}
	}
}
