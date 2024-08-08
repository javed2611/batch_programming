package stringprograms;
public class P19 {
	public static void main(String[] args) {
		String[] a = { "chai", "coffee","vadapav", "samosa",
				"biscuit", "idli" };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i].compareTo(a[j]) > 0) {
					String temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (String s : a) {
			System.out.println(s);
		}
	}
}
