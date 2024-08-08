package stringprogramming;

public class P10 {
	public static void main(String[] args) {
		String s = "java is a programming language";
		String[] a = s.split(" ");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
	}
}
// I/p - java is a programming language
// O/p - avaj si a gnimmargorp egaugnal
