package wrapper;
public class P1 {
	public static void main(String[] args) {
		int a = 10; // Primitive Type
		
		Integer i = Integer.valueOf(a); // Boxing
		System.out.println(i);
		System.out.println(i.toString());
		
		int a1 = i.intValue(); // Unboxing
		System.out.println(a1);
	}
}