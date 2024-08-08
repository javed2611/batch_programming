package stringsprograms;

public class P31 {
	public static void main(String[] args) {
		String s = "       apple is a fruit      ";
		System.out.println(s.trim());
		
		String s1 = "maharashtra ash";
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.lastIndexOf("ash"));
		
		System.out.println(s1.lastIndexOf('a',4));
		System.out.println(s1.lastIndexOf("sh", 9));
	}
}
