package stringsprograms;

public class P32 {
	public static void main(String[] args) {
//		String name = " Akhil";
//		System.out.println(name.startsWith("Mr."));
		
		String s = "       ";
		System.out.println(s.isEmpty());
		System.out.println(s.isBlank());
		
		String s1 = "Hi";
		String s2 = "hi";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
	}
}
