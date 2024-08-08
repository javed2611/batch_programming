package stringsprograms;

public class P13 {
	public static void main(String[] args) {
		String s = "this is string program";
		String[] a = s.split(" ");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
	}
}
