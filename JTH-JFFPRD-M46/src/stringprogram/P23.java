package stringprogram;

public class P23 {
	public static int countHi(String s) {
		if (s.indexOf("hi") != -1) {
			return 1 + countHi(s.substring(s.indexOf("hi") + 2));
		} else {
			return 0;
		}
	}
	public static void main(String[] args) {
		String s = "xxhixxxxxhixxhixhi";
		System.out.println(countHi(s));
	}
}
