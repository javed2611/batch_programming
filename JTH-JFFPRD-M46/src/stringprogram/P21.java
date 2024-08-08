package stringprogram;

public class P21 {
	public static void main(String[] args) {
		String s = "java is good prog lang java is best";
		System.out.println(s);
		s = s.replace(' ', '#');
		System.out.println(s);
		s = s.replace("java", "python");
		System.out.println(s);
	}
}
