package stringprogram;

public class P7 {
	public static void main(String[] args) {
		String s = "HelloWorld";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (Character.isLowerCase(ch[i])) {
				ch[i] = (char) (ch[i] - 32);
			} else if (Character.isUpperCase(ch[i])) {
				ch[i] = (char) (ch[i] + 32);
			}
		}
		String toggle = new String(ch);
		System.out.println(toggle);
	}
}
