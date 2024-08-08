package stringsprograms;
public class P6 {
	public static void main(String[] args) {
		String s = "a1d4e2sf12";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= '0' && c <= '9') {
				count++;
			}
		}
		System.out.println(count);
	}
}
