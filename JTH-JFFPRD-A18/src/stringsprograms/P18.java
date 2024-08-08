// WAP to count all the occurrence of characters in the string
// WAP to display all the unique characters in the string
// WAP to display all the duplicate characters in the string
package stringsprograms;
public class P18 {
	public static void main(String[] args) {
		String s = "maharashtra";
		boolean[] b = new boolean[s.length()];
		for (int i = 0; i < s.length(); i++) {
			if (b[i] == false) {
				int count = 1;
				for (int j = i + 1; j < s.length(); j++) {
					if (s.charAt(i) == s.charAt(j)) {
						count++;
						b[j] = true;
					}
				}
					System.out.println(s.charAt(i)+" = "+count);
			}
		}
	}
}
