package stringsprograms;
public class P19 {
	public static void main(String[] args) {
		String s = "falafal";
		boolean[] b = new boolean[s.length()];
		int index = -1;
		for (int i = 0; i < s.length(); i++) {
			if (b[i] == false) {
				int count = 1;
				for (int j = i + 1; j < s.length(); j++) {
					if (s.charAt(i) == s.charAt(j)) {
						count++;
						b[j] = true;
					}
				}
				if (count == 1) {
					index = i + 1;
					break;
				}
			}
		}
		System.out.println(index);
	}
}
