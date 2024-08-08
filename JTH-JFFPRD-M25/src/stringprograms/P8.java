// WAP to check if the second string is the rotation of 
// first string.
package stringprograms;

public class P8 {
	public static void main(String[] args) {
		String s1 = "ABCD";
		String s2 = "CDBA";
		s1 = s1 + s1;
		if (s1.contains(s2)) {
			System.out.println("Rotation");
		} else {
			System.out.println("Not a Rotation");
		}
	}
}
