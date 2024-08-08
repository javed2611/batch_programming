// WAP to remove all the vowels from the string.
// WAP to remove all the consonants from the string.
// WAP to remove all the spaces from the string.
// WAP to remove all the digits from the string.
// WAP to remove the given character from the string.
package stringprogram;

public class P4 {
	public static void main(String[] args) {
		String s = "hello world";
		String output = "";
		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			if (x!='a'&&x!='e'&&x!='i'&&x!='o'&&x!='u') {
				output = output + x;
			}
		}
		System.out.println(output);
	}
}
