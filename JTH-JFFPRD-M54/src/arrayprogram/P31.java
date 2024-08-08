package arrayprogram;

public class P31 {
	public static void main(String[] args) {
		String s1 = "apple";
		String s2 = "apple";
		System.out.println(s1 == s2);
		String s3 = new String("apple");
		String s4 = new String("apple");
		System.out.println(s3 == s4);
		System.out.println(s1 == s3.intern());
	}
}
