// WAP to convert all the lowercase charcters into uppercase
package stringsprograms;
public class P8 {
	public static void main(String[] args) {
		String s = "akHil@@%%123";
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'a' && c <= 'z') {
				res = res + (char) (c - 32);
			} else {
				res = res + c;
			}
		}
		System.out.println(res);
	}
}
