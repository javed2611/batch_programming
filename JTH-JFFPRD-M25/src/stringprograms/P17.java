package stringprograms;

public class P17 {
	public static void main(String[] args) {
		String s = "Where are you? Meet me near the clock tower.";
		String[] a = s.split(" ");
		for (int i = 0; i < a.length; i++) {
			int x = i % 3;
			if (x == 0) {
				System.out.print(vowels(a[i]) + " ");
			} else if (x == 1) {
				System.out.print(cons(a[i]) + " ");
			} else if (x == 2) {
				System.out.print(a[i].toUpperCase() + " ");
			}
		}
	}

	public static String vowels(String s) {
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'o' || ch[i] 
					== 'u' || ch[i] == 'i' || ch[i] == 'A'
					|| ch[i] == 'E' || ch[i] == 'O' || ch[i] == 'U' ||
					ch[i] == 'I') 
			{
				ch[i] = '%';
			}
		}
		String res = new String(ch);
		return res;
	}

	public static String cons(String s) {
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				if (ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' &&
						ch[i] != 'o' && ch[i] != 'u' && ch[i] != 'A'
						&& ch[i] != 'E' && ch[i] != 'I' && ch[i] != 'O' 
						&& ch[i] != 'U') 
				{
					ch[i] = '#';
				}
			}
		}
		String res = new String(ch);
		return res;
	}
}
