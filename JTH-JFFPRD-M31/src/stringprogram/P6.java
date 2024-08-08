// WAP to print all the vowels from your name.
package stringprogram;

public class P6 {
	public static void main(String[] args) {
		String s = "yogesh";
		for(int i = 0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if (!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
				ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')) {
				System.out.print(ch);
			}
		}
	}
}
