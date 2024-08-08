package stringprogram;

public class P14 {
	public static void main(String[] args) {
		String s = "java is programming lang";
		String[] a = s.split(" ");
		for (int i = 0; i < a.length; i++) {
			String str = a[i];
			String reverse = "";
			for (int j = str.length() - 1; j >= 0; j--) {
				reverse = reverse + str.charAt(j);
			}
			System.out.print(reverse + " ");
		}
	}
}
