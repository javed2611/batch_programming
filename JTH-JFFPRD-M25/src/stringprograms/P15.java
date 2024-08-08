package stringprograms;
public class P15 {
	public static void main(String[] args) {
		String s = "i love to do coding";
		String[] a = s.split(" ");
		for (int i = 0; i < a.length; i++) {
			String o = a[i];
			String rev = "";
			for (int j = o.length() - 1; j >= 0; j--) {
				rev = rev + o.charAt(j);
			}
			System.out.print(rev + " ");
		}
	}
}