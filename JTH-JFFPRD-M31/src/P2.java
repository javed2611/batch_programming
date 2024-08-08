public class P2 {
	public static void add(Object obj) {
		System.out.println(obj);
	}
	public static void main(String[] args) {
		add(10);
		add(20.4f);
		add("hi");
		add(true);
		add('c');
	}
}
