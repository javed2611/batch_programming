package stringprogram;

public class P7 {
	public static void main(String[] args) {
		String s = "aBcdE@@1323";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = (char) (ch[i] - 32);
			} else if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char) (ch[i] + 32);
			}
		}
		String res = new String(ch);
		System.out.println(res);
	}
}
