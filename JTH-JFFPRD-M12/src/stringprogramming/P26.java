package stringprogramming;

public class P26 {
	public static void main(String[] args) {
		String s = "Jspiders ";
		System.out.println(s);
		s = s.concat("Thane");
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("Qspiders ");
		System.out.println(sb);
		sb.append("Thane");
	}
}
