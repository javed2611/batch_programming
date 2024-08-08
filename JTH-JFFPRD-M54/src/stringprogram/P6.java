// WAP to convert all the lowercase characters into uppercase characters.
package stringprogram;
public class P6 {
	public static void main(String[] args) {
		String s = "javA@ proGramming123";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (Character.isLowerCase(ch[i]))// ch[i]>='a' && ch[i]<='z'
			{
				ch[i] = (char) (ch[i] - 32);
			}
		}
		String upper = new String(ch);
		System.out.println(upper);
	}
}
