package stringprogram;

public class P17 {
	public static void main(String[] args) {
		String s = "my name is amruta";
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		String[] a = reverse.split(" ");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
	}
}
