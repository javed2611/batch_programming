// WAP to check if the character is a vowel or consonant.
package basicprogramming;
public class P1 {
	public static void main(String[] args) {
		char ch = '#';
		if (ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
				|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
				System.out.println("Vowels");
			else
				System.out.println("Consonant");
		} else {
			System.out.println("Not an alphabet");
		}
	}
}
