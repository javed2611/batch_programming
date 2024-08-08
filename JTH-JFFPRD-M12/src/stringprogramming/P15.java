// WAP to check if the strings are anagram.
package stringprogramming;

import java.util.Arrays;

public class P15 {
	public static void main(String[] args) {
		String s1 = "cat";
		String s2 = "act";
		if (s1.length() == s2.length()) {
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			Arrays.sort(c1);
			sort(c2);
			boolean flag = true;
			for (int i = 0; i < c2.length; i++) {
				if (c1[i] != c2[i]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not Anagram");
			}

		} else {
			System.out.println("Not an Anagram");
		}
	}

	public static void sort(char[] ch) {
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
	}
}
