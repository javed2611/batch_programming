package stringprogram;
public class P10 {
	public static void main(String[] args) {
		String s = "jspiders thane";
		int[] alpha = new int[26];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				int index = s.charAt(i) - 'a';
				alpha[index]++;
			}
		}
		boolean isPangram = true;
		for (int i = 0; i < alpha.length; i++) {
			if (alpha[i] == 0) {
				isPangram = false;
				break;
			}
		}
		if (isPangram) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
