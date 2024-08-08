package stringprogram;

public class P25 {
	public static void main(String[] args) {
		String s = "Qspiders";
		s = s.concat(" Thane"); // immutable
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("Jspiders");
		sb.append(" Thane"); // mutable
		System.out.println(sb);
	}
}
