package stringprograms;
public class P13 {
	public static void main(String[] args) {
		String s = "xxhixxxxhixxhixhixxxhi";
		System.out.println(countHi(s));
	}
	
	public static int countHi(String s) {
		if (s.contains("hi")) {
			return 1 + countHi(s.substring(s.indexOf("hi")+2));
		}
		return 0;
	}
}
