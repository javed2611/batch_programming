package stringsprograms;
public class P30 {
	public static void main(String[] args) {
		String s = "SOSSOT";
		int n = s.length() / 3;
		String original = "";
		for (int i = 1; i <= n; i++) {
			original = original + "SOS";
		}
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (original.charAt(i) != s.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
