package stringprogram;
public class P21 {
	public static void main(String[] args) {
		String s1 = "maharashtra";
		String s2 = "india";
		System.out.println("Before Swapping");
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		s1 = s1.concat(s2);
		s2 = s1.substring(0,s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("After Swapping");
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
	}
}
