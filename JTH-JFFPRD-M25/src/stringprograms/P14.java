package stringprograms;

public class P14 {
	public static void main(String[] args) {
		String s = "i love to do coding";
		String[] a = s.split(" ");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
	}
}
