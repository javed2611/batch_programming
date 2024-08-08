package stringprogram;

public class P16 {
	public static void main(String[] args) {
		String s = "my name is amruta";
		String s1 = "";
		int i = s.length()- 1;
		while (i >= 0) {
			if (s.charAt(i) != ' ') {
				s1 = s.charAt(i) + s1;
			} else {
				System.out.print(s1 + " ");
				s1 = "";
			}
			i--;
		}
		System.out.println(s1);
	}
}
