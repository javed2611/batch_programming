package stringsprograms;

public class P34 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java Programming");
		System.out.println(sb);
		sb.append(" Language Java");
		System.out.println(sb);
		sb.insert(5, "is a ");
		System.out.println(sb);
		sb.replace(0, 4, "Python");
		System.out.println(sb);
		sb.delete(33, 38);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}
