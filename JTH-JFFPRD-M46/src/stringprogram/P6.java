// WAP to convert all lowercase alphabets into uppercase alphabets
// without using inbuilt method.
package stringprogram;
public class P6 {
	public static void main(String[] args) {
		String s = "Thane@123";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = (char) (ch[i] - 32);
			}
		}
		String res = new String(ch);
		System.out.println(res);
	}
}