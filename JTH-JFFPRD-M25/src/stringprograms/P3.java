package stringprograms;

public class P3 {
	public static void main(String[] args) {
		String s = "Glib jocks quiz nymph to vex dwarf.";
		s = s.toLowerCase();
		boolean[] b = new boolean[26];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				int x = s.charAt(i) - 97;
				b[x] = true;
			}
		}
		int count = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] == true) {
				count++;
			}
		}
		if (count == 26) {
			System.out.println("Panagram");
		} else {
			System.out.println("Not a Panagram");
		}
	}
}
