// WAP to print toggle of a String.
// I/p - WeLcoME --- > wElCOme
package stringprogramming;

public class P7 {
	public static void main(String[] args) {
		String s = "WeLcoME to ThaNE 400601";
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				res = res + (char) (s.charAt(i) - 32);
			} else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				res = res + (char) (s.charAt(i) + 32);
			} else {
				res = res + s.charAt(i);
			}
		}
		System.out.println(res);
	}
}
