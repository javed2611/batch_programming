package stringprogram;

public class P8 {
	public static void main(String[] args) {
		String s = "tOmMoRrow Is suNDaY";
		char[] a = s.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 'a' && a[i] <= 'z') {
				a[i] = (char) (a[i] - 32);
			} else if (a[i] >= 'A' && a[i] <= 'Z') {
				a[i] = (char) (a[i] + 32);
			}
		}
		String output = new String(a);
		System.out.println(output);
	}
}
