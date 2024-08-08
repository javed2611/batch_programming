package stringsprograms;

public class P33 {
	public static void main(String[] args) {
		String s = "Jspiders "; // Immutable
		s = s.concat("Thane");
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("Qspiders "); // Mutable
		sb.append("Thane");
		System.out.println(sb);
	}
}
