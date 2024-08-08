package stringsprograms;
public class P16 {
	public static void main(String[] args) {
		String s = "simply easy learning tutorialspoint";
		String[] a = s.split(" ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(capitalizeEachWord(a[i]) + " ");
		}
	}
	public static String capitalizeEachWord(String str) {
		char[] ch = str.toCharArray();
		if (ch[0] >= 'a' && ch[0] <= 'z') {
			ch[0] = (char) (ch[0] - 32);
		}
		return new String(ch);
	}
}
