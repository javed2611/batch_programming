// WAP to check if the second string is the rotation 
// of first string.
package stringprogramming;
public class P17 {
	public static void main(String[] args) {
		String s1 = "ABCD";
		String s2 = "CDBA";
		s1 = s1 + s1;
		if (s1.indexOf(s2)!=-1) {
			System.out.println("It is a rotation");
		} else {
			System.out.println("It is not a rotation");
		}
	}
}
