package stringprograms;

public class P22 {
	public static void main(String[] args) {
		String s = "Jspiders";
		s.concat(" Thane"); // Immutable
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("Qspiders");
		sb.append(" Thane"); // Mutable 
		System.out.println(sb);
	}
}
