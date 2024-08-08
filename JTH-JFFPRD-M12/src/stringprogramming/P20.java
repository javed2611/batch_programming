// WAP count the occurrence of second string in 
// the first string
package stringprogramming;
public class P20 {
	public static int countSecondString(String s1, String s2) {
		if (s1.indexOf(s2) != -1) {
			return 1 + countSecondString
				(s1.substring(s1.indexOf(s2) + 2), s2);
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		String s1 = "aaaahiaaahiaahi";
		String s2 = "h";

		System.out.println(countSecondString(s1, s2));

	}
}
