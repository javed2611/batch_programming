// WAP to print occurrence of each word in the string.
package stringprogramming;

public class P21 {
	public static void main(String[] args) {
		String s = "java is a programming language java is high level language";
		String[] a = s.split(" ");
		boolean[] b = new boolean[a.length];
		for (int i = 0; i < a.length; i++) {
			if (b[i] == false) {
				int count = 1;
				for (int j = i+1; j < a.length; j++) {
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
