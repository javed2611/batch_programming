// WAP to display duplicate characters from the string
package stringprograms;

public class P6 {
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
				if (count>1) {
					System.out.print(s.charAt(i) );
				}
			}
		}
	}
}
