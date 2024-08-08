package stringprogram;

public class P26 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Python");
		System.out.println(sb);
		sb.append(" Lang");
		System.out.println(sb);
		sb.insert(7, "Prog ");
		System.out.println(sb);
		sb.replace(0, 6, "JavaScript");
		System.out.println(sb);
		sb.delete(4, 10);
		System.out.println(sb);
		sb.deleteCharAt(8);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}
