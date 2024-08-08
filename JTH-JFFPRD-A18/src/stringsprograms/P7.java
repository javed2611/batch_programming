// WAP to remove all the spaces from the string.
// I/p -  welcome to thane
// O/p - welcometothane
package stringsprograms;
public class P7 {
	public static void main(String[] args) {
		String s = "we lc om e to t ha ne 2224552@!#$%%";
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				result = result + s.charAt(i);
			}
		}
		System.out.println(result);
	}
}
