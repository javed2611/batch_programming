// WAP to count the occurrence of each word in the sentence.
package stringprograms;

public class P16 {
	public static void main(String[] args) {
		String s = "java is coding lang java is used for coding";
		String[] a = s.split(" ");
		boolean[] b = new boolean[a.length];
		for (int i = 0; i < a.length; i++) {
			if (b[i] == false) {
				int count = 1;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i].equals(a[j])) {
						count++;
						b[j] = true;
					}
				}
				System.out.println(a[i] + " " + count);
			}
		}
	}
}
