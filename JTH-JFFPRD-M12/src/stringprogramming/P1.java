package stringprogramming;

public class P1 {
	public static void main(String[] args) {
		String s1 = "diwali";
		String s2 = "diwali";
		System.out.println(s1 == s2);
		
		String s3 = new String("diwali");
		String s4 = new String("diwali");
		System.out.println(s3 == s4);
	}
}
