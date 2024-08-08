package stringprogram;

public class P25 {
	public static void main(String[] args) {
		// Immutable
		String s = "Jspiders";
		s.concat(" Thane"); 
		System.out.println(s);
		
		// Mutable
		StringBuffer sb = new StringBuffer("Qspiders");
		char[] c = {'j','a','v','a'};
		sb.append(c);
		System.out.println(sb);
		
	}
}
