package stringprogram;

public class P2 {
	public static void main(String[] args) {
		String s1 = "mango";
		String s2 = new String("mango");
		System.out.println(s1 == s2);
		s2 = s2.intern();
		System.out.println(s1 == s2);
	}
}
