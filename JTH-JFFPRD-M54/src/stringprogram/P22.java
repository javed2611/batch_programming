package stringprogram;

public class P22 {
	public static void main(String[] args) {
		String s = "aaaaahiaaaahiaaa";
		System.out.println(countHi(s));
	}
	public static int countHi(String s) {
		if (s.contains("hi")) {
			return 1 + countHi(s.substring(s.indexOf("hi") + 2 ));
		} else {
			return 0;
		}
	}
}
