package stringprogramming;
public class P27 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java Programming ");
		System.out.println(sb);
		sb.append("Language is");
		System.out.println(sb);
		sb.insert(5, "is a ");
		System.out.println(sb);
		sb.delete(10, 22);
		System.out.println(sb);
		sb.replace(5, 7, "was");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}
