package stringprograms;

public class P23 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Jspiders");
		System.out.println(sb);
		sb.append("Thane");
		System.out.println(sb);
		sb.insert(8, " _@#%");
		System.out.println(sb);
		sb.delete(9, 13);
		System.out.println(sb);
		sb.replace(9, 14, "Mumbai");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}







