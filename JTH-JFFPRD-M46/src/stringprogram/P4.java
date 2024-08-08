// WAP to count all vowels present in your name.
package stringprogram;
public class P4 {
	public static void main(String[] args) {
		String s = "Akash";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || 
					ch == 'u' ||ch=='A'||ch=='E'||ch=='I'||ch=='O'||
					ch=='U') 
			{
				count++;
			}
		}
		System.out.println(count);
	}
}