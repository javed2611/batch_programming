package stringprogram;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class P12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toLowerCase();
		Set<Character> set = new TreeSet<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				set.add(ch);
			}
		}
		if (set.size() == 26) {
			System.out.println("Pangram");
		} else {
			System.out.println("Not a Pangram");
		}
	}
}
