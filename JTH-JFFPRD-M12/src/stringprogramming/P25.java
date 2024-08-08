package stringprogramming;

public class P25 {
	public static void main(String[] args) {
		String s = "java is a programming language which is used to write program";
		String[] a = s.split(" ");
		for (int i = 0; i < a.length; i++) {
			if (a[i].charAt(0) >= 'a' && a[i].charAt(0) <= 'z') {
				a[i] = (char)(a[i].charAt(0) - 32) + a[i].substring(1);
			}
			System.out.print(a[i] + " ");
		}
	}
}
