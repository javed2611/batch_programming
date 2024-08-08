package stringsprograms;

public class P14 {
	public static void main(String[] args) {
		String s = "this is string program";
		String[] a = s.split(" ");
		for (int i = 0; i < a.length; i++) {
			String s1 = a[i];
			String rev = "";
			for (int j = s1.length() - 1; j >= 0; j--) {
				rev = rev + s1.charAt(j);
			}
			System.out.print(rev + " ");
		}
	}
}
