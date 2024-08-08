package stringprogram;

public class P1 {
	public static void main(String[] args) {
		String s1 = "apple";
		String s2 = "apple";
		
		String s3 = new String("orange");
		String s4 = new String("orange");
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		
	}
}
