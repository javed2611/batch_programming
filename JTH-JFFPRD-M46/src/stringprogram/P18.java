package stringprogram;

public class P18 {
	public static void main(String[] args) {
		String s = "tomorrow is Result day";
		String[] a = s.split(" ");
		for (int i = 0; i < a.length; i++) {
			char[] ch = a[i].toCharArray();
			if (ch[0] >= 'a' && ch[0] <= 'z') {
				ch[0] = (char) (ch[0] - 32);
			}
			a[i] = new String(ch);
			System.out.print(a[i] + " ");
		}
	}
}
