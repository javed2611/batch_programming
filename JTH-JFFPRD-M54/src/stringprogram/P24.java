package stringprogram;

public class P24 {
	public static void main(String[] args) {
		String s = "  abc     ";
		System.out.println(s);
		System.out.println(s.strip());
		System.out.println(s.stripTrailing());
		System.out.println(s.stripLeading());
	}
}
