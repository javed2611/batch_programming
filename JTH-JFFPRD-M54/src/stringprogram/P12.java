package stringprogram;

public class P12 {
	public static void main(String[] args) {
		String s = "bat";
		int n = s.length();
		String op = s.charAt(n-1) + " " + s.charAt(n-2);
		System.out.println(op);
	}
}