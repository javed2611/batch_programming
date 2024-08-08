package stringsprograms;
public class P15 {
	public static String cons(String str) {
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' && ch[i] != 'o' && ch[i] != 'u') {
				ch[i] = '#';
			}
		}
		return new String(ch);
	}
	public static String vowels(String str) {
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				ch[i] = '%';
			}
		}
		return new String(ch);
	}

	public static void main(String[] args) {
		String s = "how are you doing? i am fine";
		String[] a = s.split(" ");
		for (int i = 0; i < a.length; i++) {
			int x = i % 3;
			if (x == 0) {
				System.out.print(vowels(a[i]) + " ");
			} else if (x == 1) {
				System.out.print(cons(a[i]) + " ");
			} else {
				System.out.print(a[i].toUpperCase() + " ");
			}
		}
	}
}
