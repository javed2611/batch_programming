package stringsprograms;
public class P28 {
	public static void main(String[] args) {
		String[] a = { "vadapav", "chai", "Samosa", "kachori", "idlli", 
				"dosa", "coffee" };
		for (int i = 1; i < a.length; i++) {
			int j = i;
			String temp = a[i];
			while (j > 0 && a[j - 1].compareToIgnoreCase(temp) > 0) {
				a[j] = a[j - 1];
				j--;
			}
			a[j] = temp;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}
}
