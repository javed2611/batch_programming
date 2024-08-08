// WAP to count all the vowels present in the string.
// WAP to count all the consonant present in the string.
// WAP to count all the numeric values present in the string.
package stringprogram;
public class P5 {
	public static void main(String[] args) {
		String s = "education";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
				count++;
			}
		}
		System.out.println(count);
	}
}
